package com.javaString;

public class Lab_008_RemoveVowelsManual 
{

	public static void main(String[] args) 
	{
		String input = "Beautiful Day";
		String result = "";

		for (int i = 0; i < input.length(); i++) 
		{
			char ch = input.charAt(i);
			if (!isVowel(ch)) {
				result += ch;
			}
		}

		System.out.println("Output: " + result);
	}

	public static boolean isVowel(char ch) 
	{
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}
