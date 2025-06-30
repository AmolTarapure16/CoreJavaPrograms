package com.javaString;

public class ReverseStringLastWord
{
     //Reverse String LastWord
	public static void main(String[] args) 
	{
		String input = "Core Java Programming";
		String rev = "";
		String splitArr[] = input.split(" ");
		
		String lastWord = splitArr[splitArr.length-1];
		
		for(int i =lastWord.length()-1; i>-1; i--)
		{
		rev = rev +lastWord.charAt(i);
		}
		
		String middleWord= splitArr[splitArr.length-2];
		String firstWord = splitArr[splitArr.length-3];
		
		System.out.println(firstWord + " " + middleWord +" " + rev );

	}

}
