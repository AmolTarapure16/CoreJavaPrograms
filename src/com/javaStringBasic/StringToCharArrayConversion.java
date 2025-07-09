package com.javaStringBasic;

public class StringToCharArrayConversion 
{
    public static char[] stringToCharArray(String input) 
    {
        return input.toCharArray();
    }
    
    public static String charArrayToString(char[] arr) 
    {
        return new String(arr);
    }
    
    public static void main(String[] args) 
    {
        char[] arr = stringToCharArray("hello");
        System.out.println(arr);
        System.out.println(charArrayToString(arr));
    }
}
