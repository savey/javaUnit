package com.unitSet;

import java.util.HashSet;
import java.util.Set;

public class Session1 {

    public static void main(String[] args) {

        //session 1

        String str = "一站式门店运营服务平台";
        String[] strs = str.split("");

        Set<String> byteSet = new HashSet<>();

        for (int i = 0; i < strs.length; i ++) {
            byteSet.add(strs[i]);
        }

        byteSet.remove("门");
        byteSet.remove("店");

        System.out.println(byteSet);
    }
}
