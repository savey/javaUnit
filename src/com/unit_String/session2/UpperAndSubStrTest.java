package com.unit_String.session2;

public class UpperAndSubStrTest {

    public static void main(String[] args) {
        testMain();
    }

    private static void testMain() {
        String str = "jdk";
        String upperStr = str.toUpperCase();

        System.out.println("大写：" + upperStr);
        int startIndex = upperStr.indexOf("DK");
        if (startIndex > 0) {
            System.out.println(upperStr.substring(startIndex, startIndex + 2));
        }
    }
}
