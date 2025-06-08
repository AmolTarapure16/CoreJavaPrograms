package com.javaString;

import java.util.Arrays;

public class CharWithOccurrence 
{
    //Java Program To Replace Character With It's Occurrence
	
	public static void main(String[] args) 
	{
		String input ="opentext";
		char charToReplace = 't';
		//expected output = open1ex2
		
		//check the char present in string
		
		if (input.indexOf(charToReplace)== -1)
		{
			System.out.println("Given char not avilable in input string..");
			System.exit(0);
		}
		
		// Logic to Replace Character With It's Occurrence
		
		int count =1;
		
		for(int i=0;i< input.length();i++)
		{
			char ch = input.charAt(i);
			if(ch ==charToReplace)
			{
				input= input.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
				count++;
			}
		}
		System.out.println(input);
	}

}
