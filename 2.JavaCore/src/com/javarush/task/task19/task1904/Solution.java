package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        
        private final Scanner fileScanner;
        
        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }


        @Override
        public Person read() throws IOException {
            String s = fileScanner.nextLine();
            String [] fio = s.split(" ");

            GregorianCalendar calendar = new GregorianCalendar(Integer.parseInt(fio[5]),
                    Integer.parseInt(fio[4])-1,
                    Integer.parseInt(fio[3]));

            Date birthDay = calendar.getTime();




            Person person = new Person(fio[1], fio[2], fio[0], birthDay);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
