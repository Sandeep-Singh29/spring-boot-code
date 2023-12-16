package com.practice.string;

public class ReverseVowelofString {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String str) {
		char[] ch = str.toCharArray();
		int i=0;
		int r = str.length()-1;
		while(i < r) {
		    if (!isVowel(ch[i])) {
		        i++;
		    } else if (!isVowel(ch[r])) {
		        r--;
		    } else {
		        char temp = ch[i];
		        ch[i] = ch[r];
		        ch[r] = temp;
		        i++;
		        r--;
		    }
		}
		return String.valueOf(ch);
	}

	private static boolean isVowel(char ch) {
		String check = String.valueOf(ch);
		String vowel = "aeiouAEIOU";
		if (vowel.contains(check)) {
			return true;
		}
		return false;
	}
	
	
}
