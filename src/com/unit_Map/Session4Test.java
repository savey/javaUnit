package com.unit_Map;

import java.util.HashMap;
import java.util.Map;

public class Session4Test {
    public static void main(String[] args) {
        Map<String, String> staffMap = new HashMap<>();
        staffMap.put("Jack", "安徽");
        staffMap.put("Rose", "江苏");
        staffMap.put("Divid", "浙江");
        staffMap.put("Lily", "安徽");
        staffMap.put("Lucy", "浙江");
        staffMap.put("Tom", "山东");

        for (Map.Entry<String, String> m: staffMap.entrySet()) {
            System.out.println(String.format("%s：%s", m.getKey(), m.getValue()));
        }
    }
}
