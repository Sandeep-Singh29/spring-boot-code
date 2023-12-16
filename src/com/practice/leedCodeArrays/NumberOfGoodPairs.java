package com.practice.leedCodeArrays;

public class NumberOfGoodPairs {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 1, 3 };
//		numIdenticalPairs(arr);
		System.out.println(numIdenticalPairs(arr));
	}

	public static int numIdenticalPairs(int[] nums) {
//		int j=1;
		int count =0;
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if (nums[i]==nums[j] && i < j) {
					count++;
				}
			}
		}
		return count;

	}
}
