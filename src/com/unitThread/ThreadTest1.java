package com.unitThread;

public class ThreadTest1 {

    public static void main(String[] args) {
        System.out.println("main线程");
        Thread thread = new MyThreadClass();
        thread.start();

        Thread thread1 = new Thread(new MyRunableClass());
        thread1.start();
    }

    static class MyThreadClass extends Thread {

        @Override
        public void run() {
            System.out.println("线程创建方式一");
        }
    }

    static class MyRunableClass implements Runnable {
        @Override
        public void run() {
            System.out.println("线程创建方式二");
        }
    }
}
