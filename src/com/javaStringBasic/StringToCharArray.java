package com.javaStringBasic;

public class StringToCharArray 
{
    public static void main(String[] args) 
    {
        String str = "Hello";

        char[] chars = str.toCharArray();

        System.out.println("Characters:");
        for (char c : chars) 
        {
            System.out.println(c);
        }
    }
}