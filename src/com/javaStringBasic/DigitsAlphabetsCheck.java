package com.javaStringBasic;

public class DigitsAlphabetsCheck 
{
    public static boolean isOnlyDigits(String str) 
    {
        return str.matches("\\d+");
    }
    
    public static boolean isOnlyAlphabets(String str) 
    {
        return str.matches("[a-zA-Z]+");
    }
    
    public static void main(String[] args) {
        System.out.println(isOnlyDigits("12345"));
        System.out.println(isOnlyDigits("123a45"));
        System.out.println(isOnlyAlphabets("abcXYZ"));
        System.out.println(isOnlyAlphabets("abc123"));
    }
}
