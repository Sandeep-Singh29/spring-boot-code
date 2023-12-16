package com.practice.leetcode_75;

public class ReverseString_151 {
	public static void main(String[] args) {
		String s = "a good   example";
		String reverseWords = reverseWords(s);
		System.out.println(reverseWords);
	}

	public static String reverseWords(String s) {
		 StringBuilder res = new StringBuilder();
		 String[] split = s.split(" +");
		 for(int i=0; i<split.length;i++) {
			 res.append(" "+split[split.length-1-i]);
		 }
		return res.toString().trim();
	}
}
