package com.automation.general;

import java.util.Scanner;

/**
* Java Program to Check Leap Year
* Note:A leap year is exactly divisible by 4 except for century years (years ending with 00). The century year is a leap year only if it is perfectly divisible by 400.
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-20
* 
*/

public class LeapYearFinder {

	public static void main(String[] args) {
		
		boolean isLeapYear=false;
		
		System.out.println("Please enter a valid year:");
		
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					isLeapYear=true;
				}else {
					isLeapYear=false;
				}
			}else {
				isLeapYear=true;
			}
		}else {
			isLeapYear=false;
		}	
		
		if(isLeapYear) {
			System.out.println("Given year is leap year");
		}else {
			System.out.println("Given year is not a leap year");
		}
		
		scan.close();
	}
}
