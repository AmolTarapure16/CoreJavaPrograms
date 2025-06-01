package com.interviewPrograms;

public class RemoveDuplicateCharacters 
{
   //Java Program To Remove Duplicate Characters In String
	
	public static void main(String[] args) 
	{
		String str ="Programing";

		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c ->sb1.append((char)c));
		System.out.println(sb1);
			
	}

}
