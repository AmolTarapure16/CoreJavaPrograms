package com.javaStringReverse;

public class Lab_002_ReverseEachWordInString 
{
	//Reverse Each Word In Given String 
	//Input - The quick brown fox jumps over the lazy dog
	//Output- ehT kciuq nworb xof spmuj revo eht yzal god 
	
	public static void main(String[] args) 
	{
		String input= "The quick brown fox jumps over the lazy dog";
		String output = "";
		
		String[] words = input.split(" ");
		
		for(String word : words)
		{
			String revWord = "";
			
			for(int i = word.length()-1; i >=0; i--)
			{
				revWord= revWord + word.charAt(i);
			}
			output = output + revWord + " ";
		}
		System.out.println("Reversed Each Word String: " + output);
	}

}
