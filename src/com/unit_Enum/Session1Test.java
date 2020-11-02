package com.unit_Enum;

public class Session1Test {

    public enum Month {
        JANUARY(1, "1月"),
        FEBRUARY(2, "2月"),
        MARCH(3, "3月"),
        ;

        int num;
        String desc;

        Month(int i, String s) {
            this.num = i;
            this.desc = s;
        }


        public static String getDesc(int num) {
            for (Month month: Month.values()) {
                if (month.num == num) {
                    return month.desc;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {

        int i = 3;

        System.out.println(Month.getDesc(i));

    }


}
