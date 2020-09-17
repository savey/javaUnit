package com.unit_String.session1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCountTest {

    public static void main(String[] args) {
        testMain();
    }

    private static void testMain() {
        String findPatten    = "(monkey)";
        String subject = "I am monkey1024.monkey like banana.little monkey is smart.";

        Pattern p = Pattern.compile(findPatten);
        Matcher m = p.matcher(subject);
        //出现次数
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println(count);
    }
}
