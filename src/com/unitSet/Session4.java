package com.unitSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Session4 {
    public static void main(String[] args) {
        String str = "This class offers constant time performance for the basic operations add remove contains and size";

        String[] strings = str.split(" ");

        Set<String> stringSet = new HashSet<>();
        stringSet.addAll(Arrays.asList(strings));
        System.out.println(stringSet.size());
    }
}
