package com.practice.leedCodeArrays;

public class IntegerPalindrom {
	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {
		int reverseNum = 0;
		int tempOriginal = x;
		while (tempOriginal > 0) {
			int lastDigit = tempOriginal % 10;
			reverseNum = reverseNum * 10 + lastDigit;
			tempOriginal = tempOriginal / 10;
		}
		if (x == reverseNum) {
			return true;
		} else {
			return false;
		}

	}
}
