package com.practice.leedCodeArrays;

import java.util.Arrays;

public class FirstAndLastElementSortedArray {

	public static void main(String[] args) {
		int a[] = {5,7,7,8,8,10};
		int target = 6;
//		searchRange(a, target);
		System.out.println(Arrays.toString(searchRange(a, target)));
	}

	public static int[] searchRange(int[] nums, int target) {
		int first = 0;
		int last = 0;
		boolean firstFlag = true;
		int findArr[] = new int[2];
		if (nums.length==0) {
			findArr[0] = -1;
			findArr[1] = -1;
			return findArr;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==target && firstFlag) {
				first = i;
				firstFlag = false;
			}
			if (nums[i]==target) {
				last = i;
			}
		}
		if (firstFlag) {
			findArr[0] = -1;
			findArr[1] = -1;
			return findArr;
		}
		findArr[0] = first;
		findArr[1] = last;
		System.out.println(Arrays.toString(findArr));
		return findArr;

	}
}
