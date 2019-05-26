package com.automation.general;

import java.util.Scanner;

/**
* Java Program to Count the Number of Vowels and Consonants in a Sentence
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-26
*/

public class Counter {

	public static void main(String[] args) {

		System.out.println("Please enter a sentence: ");

		Scanner scan = new Scanner(System.in);
		String sentence = scan.next().toLowerCase();

		int vowels = 0, consonants = 0, digits = 0, spaces = 0;

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);

			// condition for vowel
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonants++;
			}else if(ch>=0 && ch<=9) {
				digits++;
			}else if(ch==' ') {
				spaces++;
			}
		}		
		System.out.println("Above sentence caontains:");
		System.out.println("Vowels: "+ vowels);
		System.out.println("consonants: "+ consonants);
		System.out.println("Digits: "+ digits);
		System.out.println("Spaces: "+  spaces);
		
		scan.close();
	}
}
