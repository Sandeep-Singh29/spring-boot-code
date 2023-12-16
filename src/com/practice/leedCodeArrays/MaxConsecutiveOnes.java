package com.practice.leedCodeArrays;

import java.util.Arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
		findMaxConsecutiveOnes(nums);
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int maxOnes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				if (maxOnes < count) {
					maxOnes = count;
				}
			} else {
				count = 0;
			}
		}
		System.out.println(maxOnes);
		return maxOnes;

	}
}
