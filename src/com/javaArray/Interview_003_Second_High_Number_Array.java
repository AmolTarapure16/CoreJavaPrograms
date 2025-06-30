package com.javaArray;

import java.util.Arrays;

public class Interview_003_Second_High_Number_Array 
{
	public static void main(String[] args) 
	{
		int[] numbers = { 12, 34, 10, 1 };

		Arrays.sort(numbers);

		System.out.println("Second Largest Number: " + numbers[numbers.length - 2]);

	}

}
