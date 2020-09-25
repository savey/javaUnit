package com.unit_DateAndMath.session1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Session1Test {

    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();

        long nowTime = calendar.getTimeInMillis();

        String preDate = "2020-03-05";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        calendar.setTime(simpleDateFormat.parse(preDate));
        long preTime = calendar.getTimeInMillis();

        long diffDays = (nowTime - preTime) / 1000 / 86400;

        System.out.println("生日已经过了" + diffDays + "天了");

        String nextDate = "2021-03-05";
        calendar.setTime(simpleDateFormat.parse(nextDate));
        long nextTime = calendar.getTimeInMillis();

        long waitDays = (nextTime - nowTime) / 1000 / 86400;

        System.out.println("下次生日还有" + waitDays + "天");
    }
}
