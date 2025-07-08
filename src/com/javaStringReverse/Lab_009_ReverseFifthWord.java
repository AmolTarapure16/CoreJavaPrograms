package com.javaStringReverse;

public class Lab_009_ReverseFifthWord 
{	
	//Input : The quick brown fox jumps over the lazy dog
	//Output: The quick brown fox spmuj over the lazy dog

	public static void main(String[] args) 
	{
		String input = "The quick brown fox jumps over the lazy dog";
		String[] words = input.split(" ");

		if (words.length >= 5) 
		{
			// Reverse the 5th word (index 4)
			words[4] = new StringBuilder(words[4]).reverse().toString();
		}

		// Join the words back into a sentence
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < words.length; i++) 
		{
			output.append(words[i]);
			if (i < words.length - 1) 
			{
				output.append(" ");
			}
		}

		System.out.println("Output: " + output.toString());
	}

}
