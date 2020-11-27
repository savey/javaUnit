package com.unitThread;

public class ThreadTest2 {

    public static void main(String[] args) {

        //创建临界资源
        ResourceObj resourceObj = new ResourceObj();
        //实现线程1
        IncrCounter incrCounter1 = new IncrCounter(resourceObj);
//        //实现线程2
        IncrCounter incrCounter2 = new IncrCounter(resourceObj);
//        //实现线程3
        DecrCounter decrCounter = new DecrCounter(resourceObj);

        new Thread(incrCounter1, "线程1").start();
        new Thread(incrCounter2, "线程2").start();
        new Thread(decrCounter, "线程3").start();

    }

    static class IncrCounter implements Runnable{

        private ResourceObj resourceObj;

        IncrCounter(ResourceObj resourceObj) {
            this.resourceObj = resourceObj;
        }

        @Override
        public void run() {
            this.resourceObj.incr();
        }
    }


    static class DecrCounter implements Runnable{

        private ResourceObj resourceObj;

        DecrCounter(ResourceObj resourceObj) {
            this.resourceObj = resourceObj;
        }

        @Override
        public void run() {
            this.resourceObj.decr();
        }
    }


    static class ResourceObj {

        private Integer counter = 0;

        synchronized void incr() {
            this.counter++;
            System.out.println("线程："+ Thread.currentThread().getName() + "操作 + 当前Counter为:" +  this.counter);
        }

        synchronized void decr() {
            this.counter--;
            System.out.println("线程："+ Thread.currentThread().getName() + "操作 - 当前Counter为:" +  this.counter);
        }
    }
}
