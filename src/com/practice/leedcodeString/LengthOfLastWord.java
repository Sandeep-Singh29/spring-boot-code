package com.practice.leedcodeString;

import java.util.Arrays;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
//		lengthOfLastWord(s);
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
		String str = s.trim();
		String[] split = str.split(" ");
		int length = split.length;
		String finalStr = split[length - 1];
		return finalStr.length();
	}
}
