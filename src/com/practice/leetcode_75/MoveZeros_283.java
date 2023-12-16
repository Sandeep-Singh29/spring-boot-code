package com.practice.leetcode_75;

import java.util.Arrays;

public class MoveZeros_283 {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 0, 3, 12 };
		moveZeroes(arr);

	}

	public static void moveZeroes(int[] nums) {
		int j=0;
		for(int i=0; i<nums.length;i++) {
			if (nums[i]!=0) {
				nums[j++] = nums[i];
			}
		}
		for(int i=0; i<nums.length;i++) {
			if (i>=j) {
				nums[j++] = 0;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
