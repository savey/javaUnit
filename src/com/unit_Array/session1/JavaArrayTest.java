package com.unit_Array.session1;

import java.util.*;

public class JavaArrayTest {

    public static void main(String[] args) {
        // session 1
        int[] arr = {99, 23, 34, 67, 123, 234, 1, 98};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //session 2
        int[] arr2 = {1, 2, 3, 4, 2, 2, 1, 5, 6};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(Arrays.toString(set.toArray()));

        //session 3
        int[] arr3 = {1, 5, 6, 12, 1, 32, 5, 6};
        Map<Integer, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < arr3.length; i++) {
            if (!arrMap.containsKey(arr3[i])) {
                arrMap.put(arr3[i], 1);
                continue;
            }
            arrMap.put(arr3[i], arrMap.get(arr3[i]) + 1);
        }

        for (Integer key: arrMap.keySet()) {
            System.out.println(key + "出现：" + arrMap.get(key) + "次");
        }

        //session4
        Integer[] arr4 = {1, 2, 3, 4, 5};
        Object[] newArr = arrayCopy(arr4, 4, 1);
        System.out.println(Arrays.toString(newArr));
    }


    public static Object[] arrayCopy(Object[] source, int startIndex, int length) {
        if (source.length == 0) {
            return null;
        }

        if ((startIndex + length) > source.length) {
            return null;
        }

        if (startIndex < 0 || length <= 0) {
            return null;
        }

        Object[] no = new Object[length];
        int noIndex = 0;
        while (true) {
            no[noIndex] = source[startIndex];
            startIndex ++;
            if ((noIndex + 1) == length) { //新数组长度 == 截取长度 结束
                break;
            }
            noIndex++;
        }

        return no;
    }
}
