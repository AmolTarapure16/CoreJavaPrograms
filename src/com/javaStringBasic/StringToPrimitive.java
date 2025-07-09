package com.javaStringBasic;

public class StringToPrimitive 
{
    public static void main(String[] args) 
    {
        String intStr = "123";
        String doubleStr = "3.1415";
        String boolStr = "true";

        int num = Integer.parseInt(intStr);
        double pi = Double.parseDouble(doubleStr);
        boolean flag = Boolean.parseBoolean(boolStr);

        System.out.println("String to int: " + num);
        System.out.println("String to double: " + pi);
        System.out.println("String to boolean: " + flag);
    }
}