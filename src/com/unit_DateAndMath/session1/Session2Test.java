package com.unit_DateAndMath.session1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Session2Test {

    public static void main(String[] args) {

        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000; i ++) {
            int anyRandom = random.nextInt(10);
            if (!map.containsKey(anyRandom)) {
                map.put(anyRandom, 1);
                continue;
            }
            map.put(anyRandom, map.get(anyRandom) + 1);
        }

        for (Integer key: map.keySet()) {
            System.out.println(key + "出现的次数：" + map.get(key));
        }
    }
}
