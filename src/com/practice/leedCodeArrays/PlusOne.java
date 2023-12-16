package com.practice.leedCodeArrays;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		int arr[] = {9};  // 1,2,4
//		plusOne(arr);
		System.out.println(Arrays.toString(plusOne(arr)));
	}

	public static int[] plusOne(int[] digits) {
		
		  for (int i = digits.length - 1; i >= 0; i--) {
		      if (digits[i] < 9) {
		        ++digits[i];
		        return digits;
		      }
		      digits[i] = 0;
		    }

		    int[] ans = new int[digits.length + 1];
		    ans[0] = 1;
		    return ans;
		
							//		for(int i=0;i<digits.length;i++) {
							//			if (digits.length>1) {
							//				if (i==digits.length-1) {
							//					digits[i] = digits[i]+1;
							//				}
							//			}else {
							//				if (digits[i]==9) {
							//					digits = new int[digits.length+1];
							//					digits[0] = 1;
							//					digits[1] = 0;
							//					return digits;
							//				}else {
							//					digits[i] = digits[i]+1;
							//					return digits;
							//				}
							//			}
							//		}
							//		return digits;

	}
}
