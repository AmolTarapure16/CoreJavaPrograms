package com.javaStringBasic;

public class RemoveVowels
{
    public static String remove(String str) 
    {
        return str.replaceAll("(?i)[aeiou]", "");
    }
    
    public static void main(String[] args) 
    {
        System.out.println(remove("education"));
    }
}
