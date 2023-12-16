package com.practice.string;

import java.util.Arrays;

public class ReverseCharString {
	public static void main(String[] args) {
		char []ch = {'h','e','l','l','o'};
		reverseString(ch);
	}

	private static void reverseString(char[] ch) {
		int l = 0;
	    int r = ch.length - 1;
		while(l<r) {
			char temp = ch[l];
			ch[l++] = ch[r];
			ch[r--] = temp;
		}
		System.out.println(ch);
	}
}
