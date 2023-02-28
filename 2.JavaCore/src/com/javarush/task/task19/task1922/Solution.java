package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        String fileName = null;
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = input.readLine();
            }
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while((line = reader.readLine()) != null){
                int count = 0;
                for(String word:words){
                    Pattern p = Pattern.compile("\\b" + word + "\\b");
                    Matcher m = p.matcher(line);
                    if (m.find()) count++;
                }
                if(count == 2) System.out.println(line);
            }


        }
    }
}
