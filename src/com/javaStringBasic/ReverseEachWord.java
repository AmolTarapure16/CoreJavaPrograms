package com.javaStringBasic;

public class ReverseEachWord 
{
    public static String reverseWords(String str) 
    {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (String w : words) 
        {
            sb.append(new StringBuilder(w).reverse().toString()).append(" ");
        }
      
        return sb.toString().trim();
    }
    
    public static void main(String[] args) 
    {
        System.out.println(reverseWords("The quick brown fox"));
    }
}
