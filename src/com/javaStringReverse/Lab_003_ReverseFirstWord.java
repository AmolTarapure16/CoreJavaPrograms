package com.javaStringReverse;

public class Lab_003_ReverseFirstWord 
{
	// Input  ->  The quick brown fox jumps over the lazy dog
	// output ->  ehT quick brown fox jumps over the lazy dog

	public static void main(String[] args) 
	{
        String input = "The quick brown fox jumps over the lazy dog";

        // Step 1: Split the string by space
        String[] words = input.split(" ");

        // Step 2: Reverse the first word using StringBuilder
        StringBuilder sb = new StringBuilder(words[0]);
        words[0] = sb.reverse().toString();

        // Step 3: Rebuild the string
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) 
        {
            result.append(words[i]);
            if (i < words.length - 1) 
            {
                result.append(" ");
            }
        }

        // Step 4: Print result
        System.out.println("Reversed First Word String: " + result);
    }
}