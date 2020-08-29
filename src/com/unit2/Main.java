package com.unit2;

import com.unit2.test1.Calc;
import com.unit2.test1.MemberLev;
import com.unit2.test2.Guess;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //test1
        //等级2
        int lev = 2;
        Calc c = new Calc(new MemberLev(lev));
        //334.13元
        double price = 334.15;
        System.out.println(c.calc(c.yuanToFen(price)));
        System.out.println("----------------");

        //test2
        int minNum = 0;
        int hightNum = 1000;
        Random random = new Random();
        int num = random.nextInt(hightNum);
        System.out.println("Random:" + num);

        int count = 0;
        while (minNum <= hightNum) {
            count++;
            int mid = (minNum + hightNum) >> 1;
            System.out.println("第" + count + "次 Min:" + minNum + "Max:" + hightNum);
            if (num == mid) {
                System.out.println("Total:" + count + " times, guess num is:" + num);
                break;
            } else if (num < mid) { //
                hightNum = mid - 1;
            } else if (num > mid) {
                minNum = mid + 1;
            }
        }

        //test3 ZZZ....
        //test4 ZZZZZ......


        //test5
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
