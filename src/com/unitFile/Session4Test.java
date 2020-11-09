package com.unitFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Session4Test {
    public static void main(String[] args) throws IOException {
        String source = "/tmp/study/io/1.txt";
        String desc   = "/tmp/study/io/2.txt";
        copyFile(source, desc);
    }

    private static void copyFile(String sour, String des) {
        long startTime = System.currentTimeMillis();
        try {
            Files.copy(new File(sour).toPath(), new File(des).toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        long doneTime = System.currentTimeMillis();

        System.out.println("用时：" + (doneTime  - startTime) + "毫秒");
    }

}
