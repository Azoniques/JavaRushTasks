package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFile;
        String outputFile;
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in))){
            inputFile = console.readLine();
            outputFile = console.readLine();
        }
        ArrayList<String> content = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile))){
            while (reader.ready()){
                content.add(reader.readLine());
            }
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
            for (String s : content){
                writer.write(s.replaceAll("\\p{Punct}", ""));
            }
        }






    }
}
