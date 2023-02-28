package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
//        String fileName1 = args[0];
//        String fileName2 = args[1];

        String fileName1 = "D:\\Test.txt";
        String fileName2 = "D:\\1Test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
            FileWriter fileWriter = new FileWriter(fileName2)){
            String line;
            String[] strings;
            while ((line = reader.readLine()) != null) {
                strings = line.split(" ");
                for(String word: strings){
                    if(word.matches(".*[0-9].*")){
                        fileWriter.write(word + " ");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }
