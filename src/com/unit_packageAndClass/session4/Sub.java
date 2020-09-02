package com.unit_packageAndClass.session4;

public class Sub implements Compute {

    @Override
    public int computer(int leftOp, int rightOp) {
        return leftOp - rightOp;
    }
}
