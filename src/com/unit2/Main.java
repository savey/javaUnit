package com.unit2;

import com.unit2.test1.Calc;
import com.unit2.test1.MemberLev;

public class Main {

    public static void main(String[] args) {

        //等级2
        int lev = 2;
        Calc c = new Calc(new MemberLev(lev));
        //334.13元
        double price = 334.15;
        System.out.println(c.calc(c.yuanToFen(price)));
    }
}
