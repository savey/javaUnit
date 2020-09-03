package com.unit_exception.session4;

import java.io.*;

public class ThrowAndThrowsTest {

    // throw    表示程序主动的抛出一个异常类、在代码块内体内表现出来
    // throws   表明方法有异常抛出、能抛出多个不同种类异常，在申明方法的时候表现出来

    public static void main(String[] args) throws IOException {
        readFile();
    }

    public static void readFile() throws IOException {

        String localFilePath = "/Users/savey/Desktop/1.txt";
        File file = new File(localFilePath);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String tempString = null;

        int times = 0; //执行次数

        while ((tempString = bufferedReader.readLine()) != null) {
            times ++;
            System.out.println(tempString);
        }

        bufferedReader.close();

        throw new RuntimeException("代码运行出错了！");

    }
}
