package com.unit;

public class Main {

    public static void main(String[] args) {
        //10转2
        System.out.println(BaseConvertUtil.decBin(-128));
        //2转10
        System.out.println(BaseConvertUtil.binDec(0b11111111111111111111111110000000));

        System.out.println(BaseConvertUtil.baseConvert(0xAB, 16, 2));
    }
}
