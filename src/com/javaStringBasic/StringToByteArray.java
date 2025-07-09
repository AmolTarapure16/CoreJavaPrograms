package com.javaStringBasic;

import java.util.Arrays;

public class StringToByteArray 
{
    public static void main(String[] args) 
    {
        String str = "Hello";

        byte[] bytes = str.getBytes();

        System.out.println("Byte array: " + Arrays.toString(bytes));
    }
}