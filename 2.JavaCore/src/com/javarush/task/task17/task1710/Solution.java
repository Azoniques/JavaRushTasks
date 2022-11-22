package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.text.ParseException;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat formater1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        if (args[0].equals("-c")){
            Date date = formater.parse(args[3]);
            allPeople.add(args[2].equals("м") ? Person.createMale(args[1], date) : Person.createFemale(args[1], date));
            System.out.println(allPeople.size()-1);
        }

        if(args[0].equals("-r")){
            Date date = allPeople.get(Integer.parseInt(args[1])).getBirthDate();
            System.out.print(allPeople.get(Integer.parseInt(args[1])).getName() + " ");
            System.out.print(allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.MALE ? "м" + " " : "ж" + " ");
            System.out.print(formater1.format(date));
        }
        if(args[0].equals("-u")){
            Date date = formater.parse(args[4]);
            allPeople.set(Integer.parseInt(args[1]), args[3].equals("м") ? Person.createMale(args[2], date) : Person.createFemale(args[2], date));
        }
        if(args[0].equals("-d")){
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
        }
    }
}
