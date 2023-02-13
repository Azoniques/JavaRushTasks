package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputFile = bufferedReader.readLine();
            String outputFile = bufferedReader.readLine();
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            while(reader.ready()){
                reader.skip(1);
                int data = reader.read();

                writer.append((char)data);
            }
            reader.close();
            writer.close();
        }
    }
}
