package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
//        String fileName = "D:\\test.txt";
        String fileName = args[0];
        String[] strings;
        try (BufferedReader bR = new BufferedReader(new FileReader(fileName))) {
            while (bR.ready()) {
                strings = bR.readLine().split(" ");

                StringJoiner name = new StringJoiner(" ");
                StringJoiner date = new StringJoiner("/");

                for (int i = 0; i < strings.length - 3; i++) {
                    name.add(strings[i]);
                }
                for (int i = strings.length - 3; i < strings.length; i++) {
                    date.add(strings[i]);
                }
                PEOPLE.add(new Person(name.toString(), new SimpleDateFormat("dd/MM/yyyy").parse(date.toString())));

            }
        }
        for (Person elem: PEOPLE) {
            System.out.println(elem);
        }
    }
}
/*personName = personList.get(i).replaceAll("\\d", "").trim();
            personBirthDate = format.parse(personList.get(i).replace(personName, ""));*/