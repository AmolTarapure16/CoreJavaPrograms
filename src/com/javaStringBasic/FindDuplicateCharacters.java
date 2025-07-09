package com.javaStringBasic;
import java.util.HashSet;

public class FindDuplicateCharacters 
{
    public static void main(String[] args) 
    {
        String str = "programming";
        
        HashSet<Character> duplicates = new HashSet<>();
        HashSet<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) 
        {
            if (!set.add(c)) 
            {
                duplicates.add(c);
            }
        }

        System.out.println("Duplicate characters: " + duplicates);
    }
}