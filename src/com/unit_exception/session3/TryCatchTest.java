package com.unit_exception.session3;

public class TryCatchTest {

    public static void main(String[] args) {
        System.out.println(tryTest());
    }


    public static int tryTest() {
        try {
            String a = null;
            System.exit(9); // 进程终止 就不会走到了、
            throw new Exception("haha");
        } finally {
           return 435;
        }
    }
}
