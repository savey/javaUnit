package com.unit_packageAndClass.session1;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Circle implements ICalcShapeCircumference {

    private double r;
    private final double pi = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String calc() {
        DecimalFormat dFormat = new DecimalFormat("#.00");
        BigDecimal dr  = new BigDecimal(r);
        BigDecimal dpi = new BigDecimal(this.pi);
        BigDecimal dconst = new BigDecimal(2);
        return dFormat.format(dr.multiply(dpi).multiply(dconst).doubleValue());
    }
}
