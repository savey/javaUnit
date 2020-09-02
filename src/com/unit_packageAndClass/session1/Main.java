package com.unit_packageAndClass.session1;

public class Main {

    public static void main(String[] args) {
        ICalcShapeCircumference circle = new Circle(2.2);
        System.out.println("园形的周长是：" + circle.calc());

        ICalcShapeCircumference triangle = new Triangle(1, 2, 3.1);
        System.out.println("三角形的周长是：" + triangle.calc());
    }
}
