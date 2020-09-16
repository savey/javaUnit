package com.unit_Object.session1;

public class JavaVmOverFlowTest {

    public static void main(String[] args) {
        testRun(0);
    }


    private static void testRun(Integer i) {
        System.out.println(i);
        i++;
        testRun(i);
    }
}
