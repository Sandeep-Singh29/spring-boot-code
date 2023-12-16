package com.practice.leedCodeArrays;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement1 {
	public static void main(String[] args) {
		int[] arr = {6,5,5};
		majorityElement(arr);
	}

	public static int majorityElement(int[] nums) {
					//		Arrays.sort(nums);             0(ologn)
					//		int length = nums.length/2;
					//		int i = nums[length];
					//		System.out.println(i);
		int majority = nums[0];
		int vote =1;
		for(int i=1;i<nums.length;i++) {
			if (vote==0) {
				majority = nums[i];
				vote++;
			}else if (majority==nums[i]) {
				vote++;
			}else {
				vote--;
			}
		}
		System.out.println(majority);
		return majority;

	}
}
