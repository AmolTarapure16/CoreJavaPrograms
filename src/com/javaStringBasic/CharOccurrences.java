package com.javaStringBasic;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrences 
{
    public static Map<Character, Integer> countOccurrences(String str) 
    {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) 
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(countOccurrences("helloworld"));
    }
}
