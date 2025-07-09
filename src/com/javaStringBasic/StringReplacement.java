package com.javaStringBasic;

public class StringReplacement 
{
    public static void main(String[] args) 
    {
        String str = "I love Java. Java is cool.";

        // Replace all 'Java' with 'Python'
        String replaced1 = str.replace("Java", "Python");
        System.out.println("After replace(): " + replaced1);

        // Replace all 'a' with '@'
        String replaced2 = str.replaceAll("a", "@");
        System.out.println("After replaceAll(): " + replaced2);
    }
}