package com.unit_String.session5;

/**
 * 字符串可以直接用加号进行拼接，但是也有几种不同的情况. 以下不同情况的拼接,分别创建了几个对象?
 * 1） String str = "hello" + "world";
 * 2）String str1 = "hello";   String str2 = str1 + "world";
 * 3）String str1 = new String("hello"); String str2 = str1 + "world";
 */

public class StringTest {

    /*
     * 分析
     * 1：在字符串常量池里 存入“hellowworld”、创建一个对象
     *
     */
    public static void main(String[] args) {
        /*
            1: 1个对象、
            2：4个对象
            3：5个对象
         */
    }
}
