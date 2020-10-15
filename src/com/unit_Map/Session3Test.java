package com.unit_Map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Session3Test {
    public static void main(String[] args) {
        String str = "yellow";
        List list = Arrays.asList(str.split(""));
        int i = 1;
        for (Object alph: list) {
            int findAlphNum = Collections.frequency(list, alph);
            System.out.println(alph + "出现次数:" + findAlphNum);

            if (findAlphNum == 1) {
                System.out.println("第" + i + "个不重复的元素是:" + alph);
                i++;
            }
        }
    }
}
