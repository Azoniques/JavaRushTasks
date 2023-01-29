package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        String file3 = bufferedReader.readLine();

        try (FileOutputStream fos = new FileOutputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2);
             FileInputStream fis3 = new FileInputStream(file3)) {
            while (fis2.available() > 0) {
                fos.write(fis2.read());
            }

            while (fis3.available() > 0) {
                fos.write(fis3.read());
            }
        }
    }
}

