package com.unit_Object.session3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ObjectHashCodeAndEqualsTest {

    public static void main(String[] args) {
        String id = "ABCDEF";

        Set<Order> orderSet = new HashSet<>();

        Order order1 = new Order(id);
        Order order2 = new Order(id);

        orderSet.add(order1);
        orderSet.add(order2);

        System.out.println(orderSet.size());
    }


    static class Order {

        private String id;

        Order(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Order) {
                Order orderObj = (Order) obj;
                return orderObj.getId().equals(this.id);
            }
            return false;
        }

        @Override
        public int hashCode() {
            byte[] bytes = this.id.getBytes();
            StringBuilder rs = new StringBuilder();
            for (byte aByte : bytes) {
                rs.append(aByte);
            }
            return (int)Long.parseLong(rs.toString());
        }
    }

}
