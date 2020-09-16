package com.unit_Object.session1;

import java.util.ArrayList;
import java.util.List;

public class HeapOverFlowTest {

    public static void main(String[] args) {
        heapOverFlow();
    }

    //配置 Vm 堆内存大小
    private static void heapOverFlow() {

        List<String> testStringList = new ArrayList<>();

        while (true) {
            testStringList.add(new String("Yes?"));
        }
    }
}
