package com.unit_list.session4;

import java.util.ArrayList;
import java.util.List;

public class Session4Test {

    static class Worker {
        private String name;
        private Integer money;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        Integer getMoney() {
            return money;
        }

        void setMoney(Integer money) {
            this.money = money;
        }

        Integer getAge() {
            return this.age;
        }

        void setAge(Integer age) {
            this.age = age;
        }

    }

    public static void main(String[] args) {
        Worker zhangSan = new Worker();
        zhangSan.setName("zhang3");
        zhangSan.setAge(18);
        zhangSan.setMoney(3000);
        Worker liXi = new Worker();
        liXi.setName("li4");
        liXi.setMoney(3500);
        liXi.setAge(25);
        Worker xiaoQi = new Worker();
        xiaoQi.setName("wang5");
        xiaoQi.setAge(22);
        xiaoQi.setMoney(3200);

        List<Worker> workers = new ArrayList<>();
        workers.add(zhangSan);
        workers.add(liXi);
        workers.add(xiaoQi);

        Worker zhao6 = new Worker();
        xiaoQi.setName("zhao6");
        xiaoQi.setAge(24);
        xiaoQi.setMoney(3300);

        //指定位置插入一个对象
        workers.add(workers.indexOf(liXi), xiaoQi);

        //删除一个对象
        workers.remove(xiaoQi);

        //打印
        System.out.println(String.format("\t%-5s\t%-5s\t%-5s", "姓名", "年龄", "工资"));
        for (Worker worker:workers) {
            System.out.println(String.format("\t%-5s\t%-5s\t%-5s",  worker.getName(), worker.getAge(), worker.getMoney()));
        }

    }
}
