package com.interviewPrograms;

public class Interview_007_ReverseFirstWord 
{
	// Input  ->  Java programming language
	// output ->  avaJ programming language

	public static void main(String[] args) 
	{
        String input = "Java programming language";

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
