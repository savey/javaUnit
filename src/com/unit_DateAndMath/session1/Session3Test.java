package com.unit_DateAndMath.session1;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Session3Test {

    public static void main(String[] args) throws ParseException {
        String input = "2020-09-24 12:10:02";

        System.out.println(toDate(input).getTime());
    }


    public static Date toDate(String dateString) throws ParseException {
        SimpleDateFormat dateInstance = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String p = "^(\\d{4}).*(\\d{2}).*(\\d{2}).*(\\d{2})?.*(\\d{2})?.*(\\d{2})?";
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(dateString);
        if (matcher.find()) {
            String year = matcher.group(1);
            String mouth = matcher.group(2);
            String day   = matcher.group(3);
            if (year == null || mouth == null || day == null) {
                throw new ParseException("日期识别失败！", 200);
            }
            String mDate = String.format("%s-%s-%s %s:%s:%s",
                    year,
                    mouth,
                    day,
                    matcher.group(4) == null ? "00" : matcher.group(4),
                    matcher.group(5) == null ? "00" : matcher.group(5),
                    matcher.group(6) == null ? "00" : matcher.group(6)
            );
            System.out.println(mDate);

            return dateInstance.parse(mDate);
        }

        return null;
    }
}
