package com.unitFile;

import java.io.File;

public class Session1Test {

    public static void main(String[] args) {
        String dir = "/tmp/study/io";
        File file = new File(dir);

        if (!file.exists()) {
            file.mkdirs();
        } else {
            String[] files = file.list();
            if (files != null && files.length > 0) {
                for (String item: files) {
                    System.out.println("文件：" + dir + File.separator + item);
                }
            } else {
                System.out.println("没有文件");
            }
        }
    }
}
