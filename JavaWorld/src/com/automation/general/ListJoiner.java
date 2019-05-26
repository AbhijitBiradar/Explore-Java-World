package com.automation.general;

import java.util.ArrayList;
import java.util.List;

/**
* Java Program to Join Two Lists
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-21
*/

public class ListJoiner {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
		list1.add("Abhijit");
		list1.add("Vishwajeet");
		list1.add("Ranjeet");
		list1.add("Abhimanyou");
		
		System.out.println("List 1 elements:");
		System.out.println(list1);
		
		List<String> list2=new ArrayList<String>();
		list2.add("Kanchan");
		list2.add("Pooja");
		list2.add("Sonali");
		list2.add("Snehal");
		
		System.out.println("List2 elements:");
		System.out.println(list2);		
		
		//Way1
		List<String>list3=new ArrayList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println("List3 elements:");
		System.out.println(list3);		
	}
}
