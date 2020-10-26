package com.unitSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Session2 {

    public static void main(String[] args) {
        String str = "一站式门店运营服务平台";
        String[] strings = str.split("");
        TreeSet<String> stringSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        stringSet.addAll(Arrays.asList(strings));

        System.out.println("第一个：" + stringSet.first() + " 最后一个：" + stringSet.last());
    }
}
