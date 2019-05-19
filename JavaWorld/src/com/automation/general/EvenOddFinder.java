package com.automation.general;

import java.util.Scanner;

public class EvenOddFinder {

	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		Scanner console=new Scanner(System.in);
		int number=console.nextInt();
		
		if(number%2==0) {
			System.out.println("Given number is even");
		}else {
			System.out.println("Given number is odd");
		}		
		console.close();		
	}
}
