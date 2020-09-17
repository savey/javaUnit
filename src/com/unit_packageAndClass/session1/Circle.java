package com.unit_packageAndClass.session1;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Circle implements ICalcShapeCircumference {

    private double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public String calc() {
        DecimalFormat dFormat = new DecimalFormat("#.00");
        BigDecimal dr  = new BigDecimal(r);
        double pi = 3.14;
        BigDecimal dpi = new BigDecimal(pi);
        BigDecimal dconst = new BigDecimal(2);
        return dFormat.format(dr.multiply(dpi).multiply(dconst).doubleValue());
    }
}
