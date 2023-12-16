package com.practice.leedCodeArrays;

public class SearchIndexPosition {

	public static void main(String[] args) {
		int nums[] = {1,3,5,6}; // outPut :: 4
		int target = 4;
//		searchInsert(nums, target);
		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {
		int i;
		for (i=0 ; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}else if (nums[i] != target && !(target>nums[i])) {
				return i;
			} 
		}
		return i;
	}

}
