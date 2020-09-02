package com.unit_packageAndClass.session4;

public class UseCompute {

    public void useCom(Compute compute, int leftOp, int rightOp) {
       int result = compute.computer(leftOp, rightOp);
       String.format("%d %s %d = %d", leftOp, rightOp, result);
       System.out.println();
    }
}
