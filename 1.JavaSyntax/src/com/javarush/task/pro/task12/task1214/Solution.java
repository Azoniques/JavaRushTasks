package com.javarush.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Прощай, Паскаль
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        programmingLanguages.forEach(value -> System.out.println(value));

        //programmingLanguages.forEach(value -> System.out.println(value));
        //programmingLanguages.remove("Pascal");
        //programmingLanguages.forEach(value -> System.out.println(value));
        
        //System.out.println(Arrays.toString(programmingLanguages.toArray()));
        
        // for(int i = 0; i < programmingLanguages.size(); i++) {   
        //     System.out.printf("%s ", programmingLanguages.get(i));
        // }  
        
//         for(String lang: programmingLanguages){
//             System.out.printf("%s ", lang);
//         }
        
        //programmingLanguages.forEach(System.out::print);
        
    }
}
