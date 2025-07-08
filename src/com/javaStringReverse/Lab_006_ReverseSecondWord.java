package com.javaStringReverse;

public class Lab_006_ReverseSecondWord 
{
    //Input -The quick brown fox jumps over the lazy dog
	//Output-The kciuq brown fox jumps over the lazy dog
	
	public static void main(String[] args) 
	{
		String input = "The quick brown fox jumps over the lazy dog";
		String[] words = input.split(" ");

		if (words.length < 2) 
		{
			System.out.println("Input must have at least two words.");
			return;
		}

		// Reverse the second word (index 1)
		words[1] = reverseWord(words[1]);

		// Join the words back into a sentence
		StringBuilder result = new StringBuilder();
		for (String word : words) 
		{
			result.append(word).append(" ");
		}

		// Output the final result
		System.out.println(result.toString().trim());
	}

	// Helper method to reverse a word
	public static String reverseWord(String word) 
	{
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString();
	}
}