package com.javaStringBasic;

public class RepeatString 
{
    public static void main(String[] args) 
    {
        String str = "Java";

        // Java 11+ feature
        String repeated = str.repeat(3);
        System.out.println("Repeated string: " + repeated);
    }
}