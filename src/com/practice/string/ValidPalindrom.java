package com.practice.string;

public class ValidPalindrom {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		s=s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		for(int i=0; i<s.length()-1;i++) {
			if (!String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(s.length()-1-i)))) {
				return false;
			}
		}
		return true;
	}
	
	
	
}
