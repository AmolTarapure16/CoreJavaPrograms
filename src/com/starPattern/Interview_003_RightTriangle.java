package com.starPattern;

import java.util.Scanner;

public class Interview_003_RightTriangle {

	// How the pattern we want
    //  n = 3
    // *
    // **
    // ***
	public static void main(String[] args) 
	{
		System.out.println("Enter the n e.g n=3");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
