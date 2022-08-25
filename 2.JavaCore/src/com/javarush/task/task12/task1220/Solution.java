package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }
    public interface CanRun{
        boolean Run();
    }
    public interface CanSwim{
        void Swim();
    }
    public class Human implements CanSwim, CanRun{

        @Override
        public boolean Run() {
            return false;
        }

        @Override
        public void Swim() {

        }
    }
    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
}
