package com.unit2;

import java.math.BigDecimal;

/**
 * 功能描述
 * 1级会员消费满100打9折；
 * 2级会员消费满100打8折，满200打7.5折
 * 3级会员消费满100打7折，满200打6.5折，满300打6折；
 * 非会员消费满500打9折；
 */
public class Calc {

    private MemberLev memberLev;
    //满100 (分)
    private static final int BASE_FULL_100 = 10000;
    //满200 (分)
    private static final int BASE_FULL_200 = 20000;
    //满300 (分)
    private static final int BASE_FULL_300 = 30000;
    //满500 (分)
    private static final int BASE_FULL_500 = 50000;


    public Calc(MemberLev memberLev) {
        this.memberLev = memberLev;
    }


    public double calc(int price) {
        int payAmount = 0;
        switch (this.memberLev.getLev()) {
            case 0:
                if (price >=  BASE_FULL_500) {
                    payAmount = calcDiscountReduce(price, 0.9d);
                }
                break;
            case 1:
                if (price >= BASE_FULL_100) {
                    payAmount =  calcDiscountReduce(price, 0.9d);
                }
                break;
            case 2:
                if (price >= BASE_FULL_200) {
                    payAmount =  calcDiscountReduce(price, 0.79d);
                    break;
                }
                if (price >= BASE_FULL_100) {
                    payAmount =  calcDiscountReduce(price, 0.8d);
                    break;
                }
                break;
            case 3:
                if (price >= BASE_FULL_300) {
                    payAmount =  calcDiscountReduce(price, 0.6d);
                    break;
                }
                if (price >= BASE_FULL_200) {
                    payAmount =  calcDiscountReduce(price, 0.65d);
                    break;
                }
                if (price >= BASE_FULL_100) {
                    payAmount = calcDiscountReduce(price, 7D);
                    break;
                }
                break;
            default:
                payAmount = price;
                break;
        }

        return this.fenToYuan(payAmount);
    }

    //计算优惠后的实付金额
    protected int calcDiscountReduce(int price, double disc)
    {
        BigDecimal originPrice  = new BigDecimal(String.valueOf(price));
        BigDecimal discount     = new BigDecimal(String.valueOf(disc));
        BigDecimal baseDiscount = new BigDecimal(String.valueOf(1.0));

        double reduceDiscount   = baseDiscount.subtract(discount).doubleValue();

        //计算优惠的金额
        double reduce =  Math.floor(originPrice.multiply(new BigDecimal(reduceDiscount)).doubleValue());
        BigDecimal clacReduce = new BigDecimal(String.valueOf(reduce));

        //实付金额
        return originPrice.subtract(clacReduce).intValue();
    }


    // 分转为元
    protected double fenToYuan(int fen)
    {
        BigDecimal cfen = new BigDecimal(String.valueOf(fen));
        BigDecimal base = new BigDecimal(String.valueOf(100));

        return cfen.divide(base).doubleValue();
    }

    // 元转分
    protected int yuanToFen(double yuan)
    {
        BigDecimal cyuan = new BigDecimal(String.valueOf(yuan));
        BigDecimal base = new BigDecimal(String.valueOf(100));

        return cyuan.multiply(base).intValue();
    }
}
