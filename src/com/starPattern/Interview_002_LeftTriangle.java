package com.starPattern;

import java.util.Scanner;

public class Interview_002_LeftTriangle 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the n e.g n=5");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = n; i >=1; i--) 
        {
            for (int j = 1; j <=i ; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
