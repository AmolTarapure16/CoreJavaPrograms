package com.JavaPrograms;

import java.util.Scanner;

public class Interview_004_PalindromeString 
{
   //Palindrome String ->MADAM
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        // Step 1: Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Clean the input (remove non-alphanumeric and convert to lowercase)
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Step 3: Check characters using charAt()
        boolean isPalindrome = true;
        int length = cleaned.length();

        for (int i = 0; i < length / 2; i++)
        {
            if (cleaned.charAt(i) != cleaned.charAt(length - 1 - i))
            {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Print result
        if (isPalindrome)
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
	}

}
