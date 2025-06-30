package com.interviewPrograms;

public class Interview_004_RemoveDuplicateCharacters 
{
   //Java Program To Remove Duplicate Characters In String
	
	public static void main(String[] args) 
	{
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without Duplicates: " + result);
    }

    public static String removeDuplicates(String str) 
    {
        String result = "";
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            
            // If character is not already in result, append it
            
            if (result.indexOf(ch) == -1) 
            {
                result += ch;
            }
        }
        return result;
    }
			
}
