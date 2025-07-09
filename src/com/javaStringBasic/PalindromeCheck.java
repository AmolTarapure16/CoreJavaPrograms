package com.javaStringBasic;

public class PalindromeCheck 
{
    public static boolean isPalindrome(String input) 
    {
        StringBuilder sb = new StringBuilder(input);
        return input.equalsIgnoreCase(sb.reverse().toString());
    }
    
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome("hello"));
    }
}
