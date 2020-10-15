package com.unit_Map;

import java.util.HashMap;
import java.util.Map;

public class Session1Test {

    public static void main(String[] args) {
        String str = "If you want to change your life I think you must come to learn English";
        String[] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            Integer num = map.getOrDefault(s, 0);
            if (num == 0) {
                map.put(s, 1);
            } else {
                map.put(s, num + 1);
            }
        }

        for (Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }
    }
}
