package com.unit_Object.session2;

public class ToStringTest {

    static class Prople {
        private String name;
        private Integer age;

        Prople(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{\"name\":\"" + this.name  + "\", \"age\":\"" + this.age + "\"}";
        }
    }

    public static void main(String[] args) {
        Prople p = new Prople("Savey", 12);
        System.out.println(p);
    }


}
