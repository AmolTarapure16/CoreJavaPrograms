package com.javaString;

public class Lab_010_CountVowelOccurrences 
{
	public static void main(String[] args) 
	{
        String input = "Hello World";
        input = input.toLowerCase();

        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);

            switch (ch) 
            {
                case 'a': aCount++; break;
                case 'e': eCount++; break;
                case 'i': iCount++; break;
                case 'o': oCount++; break;
                case 'u': uCount++; break;
            }
        }

        System.out.println("Vowel occurrences:");
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);
    }
}
