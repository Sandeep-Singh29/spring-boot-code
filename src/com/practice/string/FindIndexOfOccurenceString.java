package com.practice.string;

public class FindIndexOfOccurenceString {
	public static void main(String[] args) {
		String a = "hurbaad";
		String b = "sad";
		int subString = getSubString(a, b);
		System.out.println(subString);

	}

	private static int getSubString(String a, String b) {
		int left = a.length();
		int right = b.length();
		if (left<right) {
			return -1;
		}
		for(int i=0; i<=left-right;i++) {
			if (a.charAt(i) == b.charAt(0)) {
				String compare = a.substring(i, i+right);
				if (compare.equals(b)) {
					return i;
				}
			}
		}
		return -1;
	}
}
