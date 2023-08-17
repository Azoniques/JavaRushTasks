package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        //String fileName =  "D:\\Test.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        TreeSet<Character> treeSet = new TreeSet<Character>();
        String s;
        while ((s= bufferedReader.readLine())!=null){
            for(char c : s.toLowerCase().toCharArray()){
                if (c >=97 && c<=122){
                    treeSet.add(c);
                }
            }
        }
        bufferedReader.close();

        int count = 0;
        for(char c : treeSet){
            System.out.print(c);
            count ++;
            if(count ==5){
                break;
            }
        }
    }
}
