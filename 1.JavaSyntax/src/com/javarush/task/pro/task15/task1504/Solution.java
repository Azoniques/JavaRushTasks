package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] bufferIn = inputStream.readAllBytes();
            byte[] bufferOut = new byte[bufferIn.length];
            for (int i = 0; i < bufferIn.length; i += 2) {
                if (i< bufferIn.length -1) {
                    bufferOut[i] = bufferIn[i + 1];
                    bufferOut[i + 1] = bufferIn[i];
                } else {
                    bufferOut[i] = bufferIn[i];
                }
            }
            outputStream.write(bufferOut);
        } catch (IOException e) {
            System.out.println("Something went wrong" + e);;
        }
    }
}

