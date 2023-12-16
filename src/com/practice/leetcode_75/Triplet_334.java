package com.practice.leetcode_75;

import java.util.Arrays;
import java.util.List;

public class Triplet_334 {

	public static void main(String[] args) {
		int arr[] = { 20,100,10,12,5,13 };
//		boolean increasingTriplet = increasingTriplet(arr);
//		System.out.println(increasingTriplet);
		boolean triplet = triplet(arr);
		System.out.println(triplet);
		
		List<Integer> l = Arrays.asList(1,2,3,5,6,6);
		List<String> s = List.of("a","b","c","d");
		System.out.println();
		
	}
//	[20,100,10,12,5,13]
	public static boolean increasingTriplet(int[] nums) {
		int count = 0;
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[j] < nums[i]) {
				j++;
				count++;
				if (count >= 3) {
					return true;
				}
			} else {
				j++;
				if (count >= 3) {
					return true;
				}
				count = 0;
			}
		}
		if (count >= 2 && nums[nums.length-2]<nums[nums.length-1]) {
			return true;
		}
		return false;
	}
	
	public static boolean triplet(int[] nums) {
		int i = Integer.MAX_VALUE , j = Integer.MAX_VALUE;
		if (nums.length<3) {
			return false;
		}
		for(int in =0; in < nums.length; in++) {
			if (nums[in]<=i) {
				i = nums[in];
			}else if(nums[in]<=j) {
				j = nums[in];
			}else {
				return true;
			}
		}
		return false;
	}
	
}
