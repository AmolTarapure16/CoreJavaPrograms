package com.javaStringReverse;

public class Lab_001_ReverseString 
{ 
	//Java Program To Reverse All String
	//Input - The quick brown fox jumps over the lazy dog
	//Output- god yzal eht revo spmuj xof nworb kciuq ehT

	public static void main(String[] args) 
	{
		String str ="The quick brown fox jumps over the lazy dog";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
				
	}

}
