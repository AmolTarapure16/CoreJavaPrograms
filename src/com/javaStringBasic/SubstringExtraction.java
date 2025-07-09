package com.javaStringBasic;

public class SubstringExtraction 
{
    public static void main(String[] args) 
    {
        String str = "HelloWorld";

        // Extract substring from index 0 to 5 (excluding 5)
        String sub1 = str.substring(0, 5);
        System.out.println("Substring (0,5): " + sub1);

        // Extract substring from index 5 to end
        String sub2 = str.substring(5);
        System.out.println("Substring (5 to end): " + sub2);
    }
}