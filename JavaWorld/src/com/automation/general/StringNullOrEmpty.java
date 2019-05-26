package com.automation.general;

/**
* Java Program to Check if a String is Empty or Null
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-22
*/

public class StringNullOrEmpty {

	public static void main(String[] args) {
		String str1=null;
		String str2="";
		
		if(isNullOrEmpty(str1)) {
			System.out.println("String 1 is null or empty");
		}else {
			System.out.println("String 1 is not null or empty");
		}
		
		if(isNullOrEmpty(str2)) {
			System.out.println("String 2 is null or empty");
		}else {
			System.out.println("String 2 is not null or empty");
		}

	}
	
	public static boolean isNullOrEmpty(String str) {		
		if(str!=null && !str.trim().isEmpty()) {
			return false;
		}else {
			return true;
		}
	}

}
