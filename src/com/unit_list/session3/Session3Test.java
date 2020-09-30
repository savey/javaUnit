package com.unit_list.session3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Session3Test {
    static class Student {
        private String name;
        private Integer age;
        private String sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        Integer getAge() {
            return age;
        }

        void setAge(Integer age) {
            this.age = age;
        }

        String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

    }

    public static void main(String[] args) {

        Student zhangSan = new Student();
        zhangSan.setName("张三");
        zhangSan.setAge(20);
        zhangSan.setSex("男");
        Student liXi = new Student();
        liXi.setName("李希");
        liXi.setAge(39);
        liXi.setSex("女");
        Student xiaoQi = new Student();
        xiaoQi.setName("小七");
        xiaoQi.setAge(18);
        xiaoQi.setSex("女");

        List<Student> students = new ArrayList<>();
        students.add(zhangSan);
        students.add(liXi);
        students.add(xiaoQi);

        System.out.println(String.format("\t%-5s\t%-5s\t%-5s", "姓名", "年龄", "性别"));
        for (Student student: students) {
            System.out.println(String.format("\t%-5s\t%-5s\t%-5s", student.getName(), student.getAge(), student.getSex()));
        }

        System.out.println("排序  + 最大年龄");

        //找出最大的年龄的
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               return o1.getAge().compareTo(o2.getAge());
            }
        });
        Student maxAgeStudent = students.get(students.size() - 1);
        maxAgeStudent.setName("葫芦娃");
        System.out.println(String.format("\t%-5s\t%-5s\t%-5s", "姓名", "年龄", "性别"));
        for (Student student: students) {
            System.out.println(String.format("\t%-5s\t%-5s\t%-5s", student.getName(), student.getAge(), student.getSex()));
        }
    }
}
