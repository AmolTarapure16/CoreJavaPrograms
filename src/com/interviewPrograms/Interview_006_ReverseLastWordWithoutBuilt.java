package com.interviewPrograms;

public class Interview_006_ReverseLastWordWithoutBuilt
{
     //Reverse String LastWord
	 // Input -> Java programming language
	 // Output-> Java programming egaugnal
	
	public static void main(String[] args) 
	{
		String input = "Java programming language";
        
        // Step 1: Find the index of last space
        int lastSpaceIndex = -1;
        for (int i = input.length() - 1; i >= 0; i--) 
        {
            if (input.charAt(i) == ' ') 
            {
                lastSpaceIndex = i;
                break;
            }
        }

        // Step 2: Split prefix and last word
        String prefix = "";
        String lastWord = "";

        if (lastSpaceIndex == -1) 
        {
            // Only one word in the input
            lastWord = input;
        } 
        else 
        {
            prefix = input.substring(0, lastSpaceIndex + 1);
            lastWord = input.substring(lastSpaceIndex + 1);
        }

        // Step 3: Manually reverse the last word
        String reversedLastWord = "";
        for (int i = lastWord.length()- 1; i >= 0; i--) 
        {
            reversedLastWord += lastWord.charAt(i);
        }

        // Step 4: Combine and print
        String result = prefix + reversedLastWord;
        System.out.println("Reversed Last Word String: " + result);
    }
}
