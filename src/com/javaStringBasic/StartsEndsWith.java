package com.javaStringBasic;

public class StartsEndsWith 
{
    public static void main(String[] args) 
    {
        String str = "Hello123World";

        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'World': " + str.endsWith("World"));
    }
}