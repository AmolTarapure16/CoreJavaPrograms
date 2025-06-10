package com.JavaPrograms;

public class SwapTwoNumbers 
{
	// Swap Two Numbers | 5 Ways of swapping Numbers

	public static void main(String[] args) 
	{
		int a= 10;
		int b= 20;
	
		System.out.println("Before Swaping values are.."+a+"  "+b);
		
		// Logic 1 ->  using third variable
		int t=a;
		a=b;
		b=t;
		
		// Logic 2 ->  using + - operator
		a=a+b;
		b=a-b;
		a=a-b;
		
		// Logic 3 ->  using * / operator
		a=a*b;
		b=a/b;
		a=a/b;
		
		// Logic 4 ->  using single statment 
		b=a+b-(a=b);
		
		System.out.println("After Swaping values are.."+a+"  "+b);

	}

}
