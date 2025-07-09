package com.javaStringBasic;

public class TrimWhitespace 
{
    public static void main(String[] args) 
    {
        String str = "   Hello World   ";
        System.out.println("Before trim: '" + str + "'");
        System.out.println("After trim: '" + str.trim() + "'");
    }
}