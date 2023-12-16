package com.practice.leedCodeArrays;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] arr = { 73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};
		moveZeroes(arr);
	}

	public static void moveZeroes(int[] nums) {
		int k =1;
		int j =0;
		int arrnew[] = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			if (nums[i]>=1 || (nums[i]<1 && nums[i]!=0)) {
				arrnew[j++] = nums[i];
			}else if (nums[i]==0) {
				arrnew[arrnew.length-k] = nums[i];
			}
		}
		for(int i=0; i<arrnew.length;i++) {
			nums[i] = arrnew[i];
		}
		System.out.println(Arrays.toString(nums));
	}
}
