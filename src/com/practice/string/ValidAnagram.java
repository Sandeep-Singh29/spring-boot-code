package com.practice.string;

public class ValidAnagram {
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		boolean anagram = isAnagram(s,t);
		System.out.println(anagram);
	}

	private static boolean isAnagram(String s,String t) {
		int a = s.length();
		int b = t.length();
		if (a!=b) {
			return false;
		}
		for(int i=0; i<=a; i++) {
			String compar = String.valueOf(s.charAt(i));
			if (!compar.contains(t)) {
				return false;
			}
		}
		
		
		return true;
	}
}
