package com.unit_exception.session2;

public class TryCatchTest {

    public static void main(String[] args) {
        tryTest();
    }

    public static void tryTest() {
        try {
            String a = null;
        } finally {
            System.out.println("没有 Catch 也走了 finally!");
        }
    }
}
