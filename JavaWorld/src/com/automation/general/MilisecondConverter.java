package com.automation.general;

import java.util.concurrent.TimeUnit;

/**
* Java Program to Convert Milliseconds to Minutes and Seconds
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-21
*/

public class MilisecondConverter {

	public static void main(String[] args) {
		long miliseconds=100000;
		
		//Way1
		System.out.println("Way 1");
		long minutes=TimeUnit.MILLISECONDS.toMinutes(miliseconds);
		long seconds=TimeUnit.MILLISECONDS.toSeconds(miliseconds);
		
		System.out.println(miliseconds +" miliseconds= "+ minutes + " minutes" );
		System.out.println(miliseconds +" miliseconds= "+ seconds + " seconds" );
		
		//Way2
		System.out.println("Way 2");
		long minutes1 = (miliseconds / 1000) / 60;
        long seconds1 = (miliseconds / 1000) % 60;

        System.out.format("%d Milliseconds = %d minutes and %d seconds.", miliseconds, minutes1, seconds1);
		
	}
}
