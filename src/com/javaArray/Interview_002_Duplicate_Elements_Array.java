package com.javaArray;

import java.util.HashSet;

public class Interview_002_Duplicate_Elements_Array 
{
	public static void main(String[] args)
	{
		int[] numbers = { 1, 2, 3, 4, 5, 1, 2 };
		
		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		for (int number : numbers) 
		{
			if (!seen.add(number)) 
			{
				duplicates.add(number);
			}
		}
		System.out.println("Duplicate elements: " + duplicates);
	}

}
