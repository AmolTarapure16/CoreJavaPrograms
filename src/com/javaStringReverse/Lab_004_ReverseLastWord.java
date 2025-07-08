package com.javaStringReverse;

public class Lab_004_ReverseLastWord 
{
	//Input  -> The quick brown fox jumps over the lazy dog
	//Output -> The quick brown fox jumps over the lazy god
			
	public static void main(String[] args) 
	{
		String input = "The quick brown fox jumps over the lazy dog";

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
		System.out.println("Reversed Last Word String: " + output.toString());
	}

}
