package com.javaStringBasic;

public class StringConcatenation 
{
    public static void main(String[] args) 
    {
        String s1 = "Hello";
        String s2 = "World";

        // Using + operator
        String result1 = s1 + " " + s2;
        System.out.println("Using + operator: " + result1);

        // Using concat()
        String result2 = s1.concat(" ").concat(s2);
        System.out.println("Using concat(): " + result2);
    }
}