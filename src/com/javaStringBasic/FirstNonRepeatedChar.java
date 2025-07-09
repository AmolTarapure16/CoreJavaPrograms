package com.javaStringBasic;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar 
{
    public static char firstNonRepeated(String str) 
    {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char c : str.toCharArray()) 
        {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        for (char c : countMap.keySet()) 
        {
            if (countMap.get(c) == 1) return c;
        }
        return '\0';
    }
    
    public static void main(String[] args) 
    {
        System.out.println(firstNonRepeated("swiss"));
    }
}
