package com.unit_list.session2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Session2Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");

        List<String> afterList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(afterList.toString());
    }
}
