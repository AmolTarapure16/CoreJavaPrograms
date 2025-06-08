package com.javaString;

public class ReverseEachWordInString 
{
	//Reverse Each Word In Given String 
	public static void main(String[] args) 
	{
		String input= "Amol Tarapure Automation Tester";
		System.out.println("Orignal String :" + input);
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
		System.out.println("Reverse String :" + output);
	}

}
