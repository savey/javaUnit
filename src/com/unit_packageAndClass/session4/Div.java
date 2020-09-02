package com.unit_packageAndClass.session4;

public class Div implements Compute {

    public static final char SYMBOL = '/';

    @Override
    public int computer(int leftOp, int rightOp) {
        return Integer.parseInt(Double.toString(leftOp / rightOp));
    }
}
