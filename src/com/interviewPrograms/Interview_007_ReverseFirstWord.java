package com.interviewPrograms;

public class Interview_007_ReverseFirstWord 
{
	// Input  ->  good morning
	// output ->  doog morning

	public static void main(String[] args) 
	{
		String input = "good morning";

		// Split the input into words
		String[] words = input.split(" ");

		// Reverse the first word
		String firstWordReversed = new StringBuilder(words[0]).reverse().toString();

		// Reconstruct the final string
		String output = firstWordReversed + " " + words[1];

		System.out.println("Output: " + output);

	}
}
