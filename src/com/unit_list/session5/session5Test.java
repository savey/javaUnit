package com.unit_list.session5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class session5Test {

    static class Student {
        private String name;
        private int age;
        private int score;
        private String classNum;

        Student(String name, int age, int score, String classNum) {
            this.name = name;
            this.age = age;
            this.score = score;
            this.classNum = classNum;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getClassNum() {
            return classNum;
        }

        public void setClassNum(String classNum) {
            this.classNum = classNum;
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Tom", 18, 100, "class05"));
        students.add(new Student("Jerry", 22, 70, "class04"));
        students.add(new Student("Owen", 25, 90, "class05"));
        students.add(new Student("Jim", 30, 80, "class05"));
        students.add(new Student("Steve", 28, 66, "class06"));
        students.add(new Student("Kevin", 24, 100, "class04"));

        int totalAge  = 0;
        int totalScore = 0;
        for (Student currentStu : students) {
            totalAge = totalAge + currentStu.getAge();
            totalScore = totalScore + currentStu.getScore();
        }

        int avgAge = totalAge / students.size();
        int avgScore = totalScore / students.size();

        System.out.println("平均年龄：" + avgAge + "\n平均分：" + avgScore);
    }
}
