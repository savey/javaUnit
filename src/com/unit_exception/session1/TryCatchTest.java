package com.unit_exception.session1;

import java.io.*;

public class TryCatchTest {

    public static void main(String[] args) {
        System.out.println("" == null);

//        readFile();
    }


    public static void readFile() {
        String localFilePath = "/Users/savey/Desktop/1.txt";
        try {
            File file = new File(localFilePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String tempString = null;

            while ((tempString = bufferedReader.readLine()) != null) {
                System.out.println(tempString);
            }
            bufferedReader.close();
        } catch (FileNotFoundException $e) {
            $e.printStackTrace();;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Bye!");
        }

    }
}
