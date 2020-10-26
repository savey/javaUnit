package com.unitSet;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Session5 {

    static class Product implements Comparable {
        private Integer id;
        private String name;
        private Double price;
        private Integer createAt;

        Product(Integer id, String name, Double price, Integer createAt) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.createAt = createAt;
        }


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        Integer getCreateAt() {
            return createAt;
        }

        public void setCreateAt(Integer createAt) {
            this.createAt = createAt;
        }

        @Override
        public String toString() {
            return "{\"name\":\"" + this.name  + "\", \"price\":\"" + this.price + "\", \"create_at\":\"" + this.createAt + "\"}";
        }

        @Override
        public int compareTo(Object o) {
            Product o1 = (Product) o;
            if (this.createAt.equals(o1.getCreateAt())) {
                return 0;
            }

            if (o1.getCreateAt() > this.getCreateAt()) {
                return 1;
            }

            return -1;
        }
    }


    public static void main(String[] args) {
        Product p1 = new Product(1, "商品A", 11.1d, 1603694033);
        Product p2 = new Product(2, "商品B", 11.2d, 1603694044);
        Product p3 = new Product(3, "商品C", 11.3d, 1603694055);

        Set<Product> productSet = new TreeSet<>();
        productSet.add(p1);
        productSet.add(p2);
        productSet.add(p3);

        System.out.println(productSet);
    }
}
