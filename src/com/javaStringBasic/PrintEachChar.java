package com.javaStringBasic;

public class PrintEachChar 
{
    public static void printChars(String str) 
    {
        for (char c : str.toCharArray()) 
        {
            System.out.println(c);
        }
    }
    
    public static void main(String[] args) 
    {
        printChars("hello");
    }
}
