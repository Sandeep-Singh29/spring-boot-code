package com.practice.leedcodeString;

public class LongestSubArrayWithRepatingWord {

	public static void main(String[] args) {
		String s = "ohomm";
//		lengthOfLongestSubstring(s);
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		String temp = "";
		String comparestr = "";
		int j=0;
		int i =0;
		if (s.equals("")) {
			return s.length();
		}
		for(i=1;i<s.length();i++) {
			temp = temp + String.valueOf(s.charAt(j++));
			if (temp.contains(String.valueOf(s.charAt(i)))) {
				if (comparestr.length()<=temp.length()) {
					comparestr = temp;
					temp ="";
				}else {
					temp = comparestr;
				}
			}
		}
		if (comparestr.length()>=temp.length()) {
			temp = comparestr;
		}
		if (temp.contains(String.valueOf(s.charAt(i-1)))) {
			return temp.length();
		}
		temp =temp + String.valueOf(s.charAt(i-1));
		return temp.length();

	}
}
