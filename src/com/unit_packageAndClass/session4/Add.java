package com.unit_packageAndClass.session4;

public class Add implements Compute {

    public static final char SYMBOL = '+';

    @Override
    public int computer(int leftOp, int rightOp) {
        return leftOp + rightOp;
    }
}
