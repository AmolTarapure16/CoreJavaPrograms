package com.javaStringBasic;

public class StringComparison 
{
    public static void compare(String s1, String s2) 
    {
        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals() : " + s1.equals(s2));
        System.out.println("Using equalsIgnoreCase() : " + s1.equalsIgnoreCase(s2));
    }
    
    public static void main(String[] args) 
    {
        compare("hello", "Hello");
        compare("test", "test");
    }
}
