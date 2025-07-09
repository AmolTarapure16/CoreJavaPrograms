package com.javaStringBasic;

public class StringLengthWithoutLength 
{
    public static int length(String input) 
    {
        int count = 0;
        try 
        {
            while (true) 
            {
                input.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) 
        {
            return count;
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.println(length("hello"));
    }
}
