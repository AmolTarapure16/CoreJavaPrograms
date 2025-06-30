package com.interviewPrograms;

public class Interview_001_ReverseString 
{ 
	//Java Program To Reverse Given String

	public static void main(String[] args) 
	{
		String str ="Amol";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
				
	}

}
