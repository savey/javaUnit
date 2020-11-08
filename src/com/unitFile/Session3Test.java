package com.unitFile;

import java.io.*;

public class Session3Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            File file = new File("/tmp/study/io/1.txt");
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            while (true) {
                String readLine = new StringBuffer(bufferedReader.readLine()).reverse().toString();
                if (!readLine.equals("quit")) {
                    bufferedWriter.write(readLine + System.lineSeparator());
                    continue;
                }
                break;
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
           e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }


    }
}
