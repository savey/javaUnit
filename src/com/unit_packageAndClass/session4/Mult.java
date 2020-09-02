package com.unit_packageAndClass.session4;

public class Mult implements Compute {

    public static final char SYMBOL = 'x';

    @Override
    public int computer(int leftOp, int rightOp) {
        return leftOp * rightOp;
    }
}
