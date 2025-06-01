package com.javaString;

public class RemoveDuplicateCharacters 
{
   //Java Program To Remove Duplicate Characters In String
	
	public static void main(String[] args) 
	{
		String str ="Programing";
		
		//Approch - 1
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c ->sb1.append((char)c));
		System.out.println(sb1);
				
		
	}

}
