
package com.javaStringBasic;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChars 
{
    public static Set<Character> findDuplicates(String str) 
    {
        Set<Character> duplicates = new HashSet<>();
        Set<Character> chars = new HashSet<>();
        
        for (char c : str.toCharArray()) 
        {
            if (!chars.add(c)) duplicates.add(c);
        }
        return duplicates;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(findDuplicates("programming"));
    }
}
