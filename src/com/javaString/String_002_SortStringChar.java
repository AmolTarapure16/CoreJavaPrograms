package com.javaString;

import java.util.Arrays;

public class String_002_SortStringChar 
{
	// Sort String Characters In Alphabetical Order
	
	public static void main(String[] args) 
	{
		// Approch - 1
		String str= "kiyansh";
		
		char arr[] = str.toCharArray();
		
		char temp;
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			  if(arr[i]>arr[j])
			  {
				  temp= arr[i];
				  arr[i]=arr[j];
				  arr[j]= temp;
			  }
			}
		}
         System.out.println(new String (arr));
         
      // Approch - 1

         String str1 = "amol";
         
         char[] charArray =str1.toCharArray();
         
         Arrays.sort(charArray);
         
         System.out.println(new String (charArray));
                
         
	}

}
