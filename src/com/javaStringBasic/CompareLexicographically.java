package com.javaStringBasic;

public class CompareLexicographically 
{
    public static void main(String[] args) 
    {
        String s1 = "apple";
        String s2 = "banana";

        int result = s1.compareTo(s2);

        if (result == 0) 
        {
            System.out.println("Strings are equal");
        } else if (result < 0) 
        {
            System.out.println(s1 + " is less than " + s2);
        } else 
        {
            System.out.println(s1 + " is greater than " + s2);
        }
    }
}