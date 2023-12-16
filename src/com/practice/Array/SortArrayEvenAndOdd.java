package com.practice.Array;

import java.util.Arrays;

public class SortArrayEvenAndOdd {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(sortArrayByParity(nums)));
	}

	public static int[] sortArrayByParity(int[] nums) {
		int arr[] = new int[nums.length];
		int j = 0;
		int k = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0)
				arr[j++] = nums[i];
			else
				arr[nums.length - k++] = nums[i];
		}
		return arr;
	}

}
