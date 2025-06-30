package com.javaString;

public class String_003_RemoveAllWhiteSpaces 
{
    //Java Program To Remove White Spaces From Given String
	public static void main(String[] args) 
	{
		String str = "J A V A I S M Y LOV E";
		System.out.println(str.replaceAll("\\s", ""));

	}

}
