package com.javaStringBasic;

import java.util.Arrays;

public class SplitString 
{
    public static String[] split(String str, String delimiter) 
    {
        return str.split(delimiter);
    }
    
    public static void main(String[] args) 
    {
        String[] parts = split("one,two,three", ",");
        System.out.println(Arrays.toString(parts));
    }
}
