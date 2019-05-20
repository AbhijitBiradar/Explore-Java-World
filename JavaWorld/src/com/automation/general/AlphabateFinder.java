package com.automation.general;

import java.util.Scanner;

/**
* Java Program to Check Whether a Character is Alphabet or Not
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-20
*/


public class AlphabateFinder {

	public static void main(String[] args) {
		
		char ch;
		System.out.println("Please, enter a character: ");
		Scanner scan=new Scanner(System.in);
		ch=scan.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println("Given character is alphabet");
		}else {
			System.out.println("Given character is not alphabet");
		}
		
		scan.close();
	}
}
