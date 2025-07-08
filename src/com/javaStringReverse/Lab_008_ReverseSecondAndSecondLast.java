package com.javaStringReverse;

public class Lab_008_ReverseSecondAndSecondLast 
{
	//Input - The quick brown fox jumps over the lazy dog
    //Output- The kciuq brown fox jumps over the yzal dog
	
	public static void main(String[] args) 
	{
		String input = "The quick brown fox jumps over the lazy dog";
		String[] words = input.split(" ");

		if (words.length < 4) 
		{
			System.out.println("Input must have at least 4 words to reverse second and second last.");
			return;
		}

		// Reverse second word (index 1)
		words[1] = reverseWord(words[1]);

		// Reverse second last word (index length - 2)
		words[words.length - 2] = reverseWord(words[words.length - 2]);

		// Join words back to a sentence
		StringBuilder result = new StringBuilder();
		for (String word : words) 
		{
			result.append(word).append(" ");
		}

		// Output the final sentence
		System.out.println(result.toString().trim());
	}

	// Helper method to reverse a word
	public static String reverseWord(String word) 
	{
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString();
	}
}