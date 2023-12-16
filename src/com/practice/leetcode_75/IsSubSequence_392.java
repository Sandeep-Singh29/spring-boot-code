package com.practice.leetcode_75;

public class IsSubSequence_392 {

	public static void main(String[] args) {
		String s = "abc", t = "ahbgdc";
		boolean subsequence = isSubsequence(s, t);
		System.out.println(subsequence);
	}

	public static boolean isSubsequence(String s, String t) {
		if (s.length() == 0) {
			return true;
		}
		int i = 0;
		int j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				j++;
			}
		}
		if (i == s.length()) {
			return true;
		}
		return false;
	}
}
