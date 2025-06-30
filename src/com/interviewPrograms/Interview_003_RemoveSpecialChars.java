package com.interviewPrograms;

public class Interview_003_RemoveSpecialChars 
{
   //Java Program To Remove Special Characters From Given String
	
	public static void main(String[] args) 
	{
		String str = "#I$Lo@ve%Ja^va*";
		
		String PlainString = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(PlainString);

	}

}
