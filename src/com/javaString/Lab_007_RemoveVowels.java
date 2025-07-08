package com.javaString;

public class Lab_007_RemoveVowels
{
	public static void main(String[] args) {
        String input = "Hello World";

        // Remove all vowels using regex
        
        String output = input.replaceAll("(?i)[aeiou]", "");

        System.out.println("Output: " + output);
    }
}
