package com.practice.leedcodeString;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
//		reverseWords(s);
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		StringBuilder builder = new StringBuilder();
		for(String word : s.split(" ")) {
			StringBuilder tmp = new StringBuilder(word);
			tmp.reverse();
			builder.append(tmp + " ");
		}
		return builder.toString().trim();
	}
}
