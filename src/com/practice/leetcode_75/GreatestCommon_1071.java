package com.practice.leetcode_75;

public class GreatestCommon_1071 {

	public static void main(String[] args) {
		String str1 = "ABABABABABABAB", str2 = "ABAB";
		String gcdOfStrings = gcdOfStrings(str1, str2);
		System.out.println(gcdOfStrings);
//		int gcd = gcd(6, 3);
//		System.out.println(gcd);
	}

	public static String gcdOfStrings(String str1, String str2) {
		if (!(str1+str2).equals(str2+str1)) {
			return "";
		}
		return str1.substring(0, gcd(str1.length(), str2.length()));
	}
//	public static int gcd(int a, int b) {
//		if (b == 0) {
//			return a;
//		}
//		return gcd(b, a % b);
//	}
	
	public static int gcd(int a, int b) {
		int gcd = 0;
		for(int i=2 ; i<=a;i++) {
			if (a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
}
