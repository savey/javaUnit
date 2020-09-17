package com.unit_String.session3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FoundStrIndexTest {

    public static void main(String[] args) {
        testMain();
    }

    private static void testMain() {
        String subject = "abcd23abcd34bcd";
        String patten  = "(bc)";
        Pattern p = Pattern.compile(patten);
        Matcher m = p.matcher(subject);
        int count = 0;
        while (m.find()) {
            ++count;
            System.out.println("第"+ count +"个bc的位置:" + m.start());
        }
    }
}
