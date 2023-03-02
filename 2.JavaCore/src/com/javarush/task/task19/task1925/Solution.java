package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String srcFile = args[0];
        String dstFile = args[1];

//        String srcFile = "D:\\Test.txt";
//        String dstFile = "D:\\Test1.txt";


        BufferedReader reader = new BufferedReader( new FileReader(srcFile));
        try (FileWriter writer = new FileWriter(dstFile)) {
            String result = reader.lines().flatMap(line -> Arrays.stream(line.split(" ")))
                    .filter(word -> word.length() > 6)
                    .collect(Collectors.joining(","));
            writer.write(result);

        }reader.close();


    }
}

