package com.javaStringBasic;

public class StringToIntExceptionHandling 
{
    public static void main(String[] args) 
    {
        String valid = "123";
        String invalid = "12a3";

        try 
        {
            int num = Integer.parseInt(valid);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) 
        {
            System.out.println("Invalid number: " + valid);
        }

        try 
        {
            int num = Integer.parseInt(invalid);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) 
        {
            System.out.println("Invalid number: " + invalid);
        }
    }
}