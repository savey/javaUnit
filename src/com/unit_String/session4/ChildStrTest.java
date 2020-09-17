package com.unit_String.session4;

public class ChildStrTest {
    public static void main(String[] args) {
        testMain();
    }

    private static void testMain() {
        String s = "113@ ere qqq yyui";
        String[] strArray = s.replace("@", "").split(" ");

        for (String str: strArray) {
            System.out.println(str);
        }
    }
}
