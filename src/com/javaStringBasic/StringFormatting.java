package com.javaStringBasic;

public class StringFormatting 
{
    public static void main(String[] args) 
    {
        String name = "Alice";
        int age = 25;

        // Using String.format()
        String formatted1 = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formatted1);

        // Using printf()
        System.out.printf("Name: %s, Age: %d%n", name, age);
    }
}