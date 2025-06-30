package com.javaArray;

public class Interview_001_Reverse_Array 
{
	// Input { 10,11,12, 18,19,20 }
	// Output { 20,19,18, 12,11,10 }
	
	public static void main(String[] args) 
	{
		int[] arr = { 10, 11, 12, 18, 19, 20 };
		int n = arr.length;

		// Reverse the array in-place
		for (int i = 0; i < n / 2; i++) 
		{
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}

		// Print the reversed array
		System.out.print("Output: { ");
		for (int num : arr) 
		{
			System.out.print(num + " ");
		}
		System.out.println("}");

	}

}
