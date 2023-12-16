package com.practice.string;

public class ReverseString {

	public static void main(String[] args) {
		reverseWord("Sandeep");
		System.out.println(reverseWord("Sandeep"));

	}
	
	public static String reverseWord(String str) {
		String name = str;
//		System.out.println(name);
		String reverseString = "";
		for(int i=name.length()-1; i>=0; i--) {
			reverseString = reverseString + name.charAt(i);
//			System.out.println(reverseString);
		}
		return reverseString;
    }

}
