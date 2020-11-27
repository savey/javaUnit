package com.unitThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadTest3 {

    static class Printer{

        private ArrayList<Integer> arrayList = new ArrayList<>();

        Printer() {
            this.arrayList.add(1);
            this.arrayList.add(2);
            this.arrayList.add(3);
            this.arrayList.add(4);
            this.arrayList.add(5);
            this.arrayList.add(6);
        }

        public void printerLast() throws InterruptedException {
            synchronized (this) {
                while (this.arrayList.size() > 0) {
                    this.notify();
                    Thread.sleep(1000L);
                    Integer removeInteger = this.arrayList.remove(0);
                    System.out.println("线程：" + Thread.currentThread().getName() + "打印了：" + removeInteger);
                    this.wait();
                }
            }
        }
    }

    public static void main(String[] args) {
    }
}
