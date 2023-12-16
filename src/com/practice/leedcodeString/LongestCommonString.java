package com.practice.leedcodeString;

import java.util.Arrays;
import java.util.Iterator;

public class LongestCommonString {
	public static void main(String[] args) {
		String str[] = {"flower","flow","flght"};
//		longestCommonPrefix(str);
		System.out.println(longestCommonPrefix(str));
	}
	 public static String longestCommonPrefix(String[] strs) {
		 StringBuilder builder = new StringBuilder();
		 Arrays.sort(strs);
		 char[] first = strs[0].toCharArray();
		 char[] last = strs[strs.length-1].toCharArray();
		 for(int i=0;i<first.length;i++) {
			 if (first[i]!=last[i]) {
				break;
			}
			 builder.append(first[i]);
		 }
		return builder.toString();
	        
	    }
}
