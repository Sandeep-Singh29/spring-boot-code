package com.practice.string;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] arr = { "geeeks", "geeek", "geeezer", "geeeksforgeeks" };
		String commonPrefix = getCommonPrefix(arr);
		System.out.println(commonPrefix);

	}

	private static String getCommonPrefix(String[] arr) {
		int n = arr.length;
		String result = arr[0];
		for (int i = 1; i < n; i++) {
			while (arr[i].indexOf(result) != 0) {
				result = result.substring(0, result.length() - 1);
				if (result.equals("")) {
					return "-1";
				}
			}
		}
		return result;
	}
}
