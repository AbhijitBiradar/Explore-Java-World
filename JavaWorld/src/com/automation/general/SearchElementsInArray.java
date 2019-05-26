package com.automation.general;

import java.util.Scanner;

/**
* Java Program to search element in array
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-26
*/

public class SearchElementsInArray {

	public static void main(String[] args) {
		
		int array1[]= {12,3,4,5,6,7,8,9,0};
		
		System.out.println("Enter a number to search in array: ");
		Scanner scan=new Scanner(System.in);
		int searchElement=scan.nextInt();
		
		boolean elementFound=false;
		for(int index:array1) {
			if(index==searchElement) {
				elementFound=true;
				break;
			}
		}
		
		if(elementFound) {
			System.out.println("Search element found in array");
		}else {
			System.out.println("Search element not found in array");
		}
		
		scan.close();
	}
}
