package com.javaStringBasic;

public class ReverseStringExample 
{
    public static void main(String[] args) 
    {
        String str = "Hello";

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}