package com.javaString;

public class Lab_004_RemoveAllDigits 
{
    //Java Program To Remove White Spaces From Given String
	
	public static void main(String[] args) 
	{
		String str = "JAVA2005ISMY143";
		System.out.println(str.replaceAll("\\d", ""));

	}
}
