package com.automation.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* Java Program to Convert List (ArrayList) to Array and Vice-Versa
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-22
*/

public class ArrayListConverter {

	public static void main(String[] args) {
	
		System.out.println("Convert Array to list");
		String[] array1= {"Abhijit","Abhimanyou","Biradar"};
		
		System.out.println("Array Elements:");
		
		for(String str: array1) {
			System.out.print(" "+ str);
		}
		
		System.out.println("ArrayList Elements:");
		List<String> list1=new ArrayList<String>();
		list1=Arrays.asList(array1);
		
		System.out.println("ArrayList Elements:");
		System.out.println(list1);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("Convert list to array");
		List<String> list2=new ArrayList<String>();
		list2.add("Abhijit");
		list2.add("Karthik");
		
		System.out.println("ArrayList Elements:");
		System.out.println(list2);
		
		String[] array2=new String[list2.size()];
		list2.toArray(array2);
		
		System.out.println("Array Elements:");		
		System.out.println(Arrays.toString(array2));		
	}
}
