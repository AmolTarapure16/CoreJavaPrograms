package com.javaStringBasic;

public class WordCount 
{
    public static int countWords(String str) 
    {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(countWords("The quick brown fox jumps"));
    }
}
