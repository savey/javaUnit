package com.unit_exception.session1;

import java.io.*;

public class TryCatchTest {

    public static void main(String[] args) {
        readFile();
    }


    public static void readFile() {
        String localFilePath = "/Users/savey/Desktop/orders.csv";
        try {
            File file = new File(localFilePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = bufferedReader.readLine()) != null) {
                System.out.println(tempString);
            }
        } catch (FileNotFoundException $e) {
            $e.printStackTrace();;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Bye!");
        }

    }
}
