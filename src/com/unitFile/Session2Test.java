package com.unitFile;

import java.io.File;

public class Session2Test {

    public static void main(String[] args) {
        String dir = "/tmp/study/io";
        File file  = new File(dir);

        if (file.isDirectory()) {
            String[] files = file.list();
            if (files != null && file.length() > 0) {
                long flagLength = 20 * 1024;
                for (String item:files) {
                    String itemPath = dir + File.separator + item;
                    File file1 = new File(itemPath);
                    long itemLength = file1.length();
                    if (itemLength >= flagLength) {
                        file1.delete();
                    }
                }
            }
        }
    }
}
