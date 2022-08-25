package com.javarush.task.pro.task08.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/
public class NameComparator implements Comparator<JavaRushMentor> {

    @Override
    public int compare (JavaRushMentor mentor1, JavaRushMentor mentor2){
        return mentor1.toString().length() - mentor2.toString().length();
    }
}
