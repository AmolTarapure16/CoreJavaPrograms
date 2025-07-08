package com.javaStringReverse;

public class Lab_007_ReverseSecondLastWord 
{
	//Input  - The quick brown fox jumps over the lazy dog
	//Output - The quick brown fox jumps over the yzal dog
	
	public static void main(String[] args) 
	{
		String input = "The quick brown fox jumps over the lazy dog";
		String[] words = input.split(" ");

		if (words.length < 2) 
		{
			System.out.println("Not enough words to reverse the second last one.");
			return;
		}

		// Reverse the second last word (index = length - 2)
		words[words.length - 2] = reverseWord(words[words.length - 2]);

		// Join all words back into a sentence
		StringBuilder result = new StringBuilder();
		for (String word : words) 
		{
			result.append(word).append(" ");
		}

		// Print the final sentence
		System.out.println(result.toString().trim());
	}

	// Helper method to reverse a word
	public static String reverseWord(String word) 
	{
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString();
	}

}
