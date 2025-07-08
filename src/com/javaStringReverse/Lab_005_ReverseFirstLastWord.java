package com.javaStringReverse;

public class Lab_005_ReverseFirstLastWord 
{
	// Input - The quick brown fox jumps over the lazy dog
	// Output- ehT quick brown fox jumps over the lazy god

	public static void main(String[] args) 
	{

		String input = "The quick brown fox jumps over the lazy dog";
		String[] words = input.split(" ");

		if (words.length == 0) 
		{
			System.out.println("Empty string.");
			return;
		}

		// Reverse the first word
		words[0] = reverseWord(words[0]);

		// Reverse the last word
		words[words.length - 1] = reverseWord(words[words.length - 1]);

		// Join all words back to a single string
		StringBuilder result = new StringBuilder();
		for (String word : words) 
		{
			result.append(word).append(" ");
		}

		// Print trimmed result
		System.out.println(result.toString().trim());
	}

	// Method to reverse a single word
	public static String reverseWord(String word) 
	{
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString();
	}

}
