package com.practice.leedCodeArrays;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 3, 0, 1, 4, 5 };
		missingNumber(arr);
	}

	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int sum =0;
		for(int i=0;i<nums.length;i++) {  // 0,1,3,4,5
			
			if (nums[i]==sum) {
				return sum;
			}
		}
		return -1;

	}
}
