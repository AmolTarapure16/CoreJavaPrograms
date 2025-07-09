package com.javaStringBasic;

public class SubstringContains 
{
    public static boolean contains(String str, String sub) 
    {
        return str.contains(sub);
    }
    
    public static void main(String[] args) 
    {
        System.out.println(contains("hello world", "world"));
        System.out.println(contains("hello", "bye"));
    }
}
