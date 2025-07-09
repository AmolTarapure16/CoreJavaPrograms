package com.javaStringBasic;

public class SearchingInString 
{
    public static void main(String[] args) 
    {
        String str = "Java programming is fun";

        // indexOf()
        int firstIndex = str.indexOf('a');
        System.out.println("First index of 'a': " + firstIndex);

        // lastIndexOf()
        int lastIndex = str.lastIndexOf('a');
        System.out.println("Last index of 'a': " + lastIndex);

        // indexOf substring
        int wordIndex = str.indexOf("program");
        System.out.println("Index of 'program': " + wordIndex);
    }
}