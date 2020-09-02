package com.unit_packageAndClass.session1;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Triangle implements ICalcShapeCircumference {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String calc() {
        DecimalFormat dFormat = new DecimalFormat("#.00");
        BigDecimal da  = new BigDecimal(this.a);
        BigDecimal db = new BigDecimal(this.b);
        BigDecimal dc = new BigDecimal(this.c);
        return dFormat.format(da.add(db).add(dc).doubleValue());
    }
}
