package com.interviewPrograms;

public class Interview_009_SelectiveWordReversal 
{
	//Input:  java program love code string  
	//Output: java margorp love edoc string
	
	public static void main(String[] args) 
	{
		String input = "java program love code string";

		// Split input into words
		String[] words = input.split(" ");

		// Reverse only the 2nd and 4th words (index 1 and 3)
		for (int i = 0; i < words.length; i++) 
		{
			if (i == 1 || i == 3) 
			{
				words[i] = new StringBuilder(words[i]).reverse().toString();
			}
		}

		// Join the words back into a string
		String output = String.join(" ", words);

		// Print the output
		System.out.println("Output: " + output);

	}
}
