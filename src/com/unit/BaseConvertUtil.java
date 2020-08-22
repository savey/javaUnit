package com.unit;

import java.util.Collections;
import java.util.LinkedList;

public class BaseConvertUtil {

    //10 to 2
    public static String decBin (int decimal) {
        int divisor = 2;
        String bin = "";

        //数值
        int calcdecimal = Math.abs(decimal);

        do {
            if ((calcdecimal & 1) == 0) { //被除数是偶数
                calcdecimal = calcdecimal / divisor; //计算下一次被除数
                bin = 0 + bin ;
            } else { //
                calcdecimal = (calcdecimal - 1) / divisor; //计算下一次被除数
                bin = 1 + bin ;
            }

        } while (calcdecimal != 0);

        //最高位为符号位
        int padLength = Integer.SIZE - bin.length() - 1;

        //补0操作
        for (int i = 0; i < padLength; i ++) {
            bin = 0 + bin;
        }
        //正数直接返回
        if (decimal >= 0) {
            return "0" + bin;
        }

        //负数求反
        char[] binArr = bin.toCharArray();
        int[] turnBinArr = new int[bin.length()]; //存入取反后的二进制
        for (int j = 0; j < binArr.length; j ++) {
            turnBinArr[j] = Integer.parseInt(String.valueOf(binArr[j])) ^ 1;
        }

        //+ 1
        int flag = 1;
        //存入 + 1后的
        String afterBin = "";
        for (int i = turnBinArr.length; i != 0; i--) {
            int afterSum   = turnBinArr[i - 1] ^ flag;
            if (afterSum == 0 && turnBinArr[i - 1] != 0) {
                flag = 1; //前 + 1
                afterBin = 0 + afterBin;
            } else {
                flag = 0;
                afterBin = afterSum + afterBin;
            }
        }

        return 1 + afterBin;
    }

    //2进制转10进制
    public static int binDec(int binary) {
        if (binary >= 0) {
            return binary;
        }
        //负数 减1取反 添加符号
        binary = ~(binary - 1);
        return -binary;
    }


    //string to int
    public static int stringToInt(String str)
    {
        return Integer.parseInt(str);
    }

    // string to long
    public static long stringToLong(String str)
    {
        return Long.parseLong(str);
    }

    //string to float
    public static float stringToFloat(String str) {
        return Float.parseFloat(str);
    }

    //string to double
    public static double stringToDouble(String str) {
        return Double.parseDouble(str);
    }

    //string to byte array
    public static byte[] stringToBytes(String str) {
        return str.getBytes();
    }

    //int to string
    public static String intToString(int number) {
        return String.valueOf(number);
    }

    //byte array to string
    public static String bytesToString(byte[] bytes) {
        String str = new String(bytes);
        return str.toString();
    }

    //char to ascii
    public static String charToAscii(char c)
    {
        StringBuffer sbu = new StringBuffer();
        char[] chars = String.valueOf(c).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1)
            {
                sbu.append((int)chars[i]).append(",");
            }
            else {
                sbu.append((int)chars[i]);
            }
        }
        return sbu.toString();
    }

    // ascii to char
    public static String asciiToChar(String value)
    {
        StringBuffer sbu = new StringBuffer();
        String[] chars = value.split(",");
        for (int i = 0; i < chars.length; i++) {
            sbu.append((char) Integer.parseInt(chars[i]));
        }
        return sbu.toString();
    }

    public static int baseConvert(int num, int frombase, int tobase)
    {
        if (frombase == 2) {
            switch (tobase) {
                case 10:
                    return Integer.valueOf(num);
                case 16:
                    return Integer.parseInt(Integer.toHexString(num));
                default:
                    return num;
            }
        }

        if (frombase == 10) {
            switch (tobase) {
                case 2:
                    return Integer.parseInt(Integer.toBinaryString(num));
                case 16:
                    return Integer.parseInt(Integer.toHexString(num));
                default:
                    return num;
            }
        }

        if (frombase == 16) {
            switch (tobase) {
                case 2:
                    return Integer.parseInt(Integer.toBinaryString(num));
                case 16:
                    return Integer.parseInt(Integer.toHexString(num));
                default:
                    return num;
            }
        }

        return num;
    }
}
