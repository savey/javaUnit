package com.unit_Object.session1;

public class LocalMemonyOverFlowTest {

    public static void main(String[] args) {
        testLocalMethodOverFlow();
    }


    private static void testLocalMethodOverFlow() {
        int i = 0;
        while (true) {
            i++;
            System.out.println(i);
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {

                    }
                }
            });
            thread.start();
        }
    }
}
