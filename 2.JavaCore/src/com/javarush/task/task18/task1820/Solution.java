package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))){
            while(bufferedReader.ready()){
                String [] split = bufferedReader.readLine().split(" ");
                for(String str : split){
                bufferedWriter.write(Math.round(Double.parseDouble(str)) + " ");
                }
            }
        }

    }
}
