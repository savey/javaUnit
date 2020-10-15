package com.unit_Map;

import java.util.*;

public class Session2Test {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("玩家A", 10);
        map.put("玩家B", 20);
        map.put("玩家C", 30);
        map.put("玩家D", 40);
        map.put("玩家E", 50);
        map.put("玩家F", 50);

        //考虑有分数一样的情况
        Map<Integer, List<Map.Entry<String, Integer>>> mutiSort = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (Map.Entry<String, Integer> m: map.entrySet()) {
            List<Map.Entry<String, Integer>> item = mutiSort.getOrDefault(m.getValue(), null);
            if (item != null) {
                mutiSort.get(m.getValue()).add(m);
            } else {
                List<Map.Entry<String, Integer>> initM = new ArrayList<>();
                initM.add(m);
                mutiSort.put(m.getValue(), initM);
            }
        }

        int i = 1;
        for (Map.Entry<Integer, List<Map.Entry<String, Integer>>> sm: mutiSort.entrySet()) {
            for (Map.Entry<String, Integer> stu: sm.getValue()) {
                System.out.println(String.format("第%d名：%s、得分：%d", i, stu.getKey(), stu.getValue()));
            }
            i++;
        }

    }
}
