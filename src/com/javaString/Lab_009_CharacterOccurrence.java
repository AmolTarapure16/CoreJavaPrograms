package com.javaString;

import java.util.HashMap;
import java.util.Map;

public class Lab_009_CharacterOccurrence 
{
 //Java Program To Find Occurrence Of Each Character
	
	public static void main(String[] args) 
	{
		String input = "AMOLTARAPURE";
		
		Map<Character, Integer> map = new HashMap();
		
		char[] chars = input.toCharArray();
		
		for(char ch : chars)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				int value = map.get(ch);
				map.put(ch, value + 1);
			}
		}
		System.out.println(map);
	}

}
