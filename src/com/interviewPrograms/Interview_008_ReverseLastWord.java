package com.interviewPrograms;

public class Interview_008_ReverseLastWord 
{
	//Input  -> Core Java Programming
	//Output -> Core Java gnimmargorP
			
	public static void main(String[] args) 
	{
		String input = "Core Java Programming";

		// Split input by space
		String[] words = input.split(" ");

		// Reverse the last word
		String lastWord = words[words.length - 1];
		String reversedLastWord = new StringBuilder(lastWord).reverse().toString();

		// Build the output
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < words.length - 1; i++) 
		{
			output.append(words[i]).append(" ");
		}
		output.append(reversedLastWord);

		// Print the result
		System.out.println("Output: " + output.toString());
	}

}
