package com.javaStringBasic;

public class RemoveWhitespace 
{
    public static String removeWhitespace(String str) 
    {
        return str.replaceAll("\\s+", "");
    }
    
    public static void main(String[] args) 
    {
        System.out.println(removeWhitespace(" h e l l o "));
    }
}
