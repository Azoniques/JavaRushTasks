package com.javarush.task.pro.task17.task1709;

public interface Student {
    public String getName();
}
class StudentImpl implements Student
{
    private String name;
    public StudentImpl(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    private void setName(String name)
    {
        this.name = name;
    }
}
