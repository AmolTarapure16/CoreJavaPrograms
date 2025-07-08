package com.javaString;

public class Lab_011_VowelIndexes {

	public static void main(String[] args)
	{
        String input = "Hello World";

        System.out.println("Vowel positions in the string:");
        
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);

            if (isVowel(ch)) 
            {
                System.out.println("Vowel '" + ch + "' at index: " + i);
            }
        }
    }

    public static boolean isVowel(char ch) 
    {
        ch = Character.toLowerCase(ch); // Make it case-insensitive
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
