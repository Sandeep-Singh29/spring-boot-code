package com.practice.leedCodeArrays;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int []arr = {0,1,2,2,3,0,4,2};  // Remove Val Element and count of ather ekement :: 5
		int val = 2;
//		removeElement(arr, val);
		System.out.println(removeElement(arr, val));
	}

	public static int removeElement(int[] nums, int val) {
		int count =0;
		int arr[] = new int[nums.length];
		int j =0;
		for(int i=0;i<nums.length; i++) {
			if (nums[i]!=val) {
				arr[j++] = nums[i];
			}else {
				count++;
			}
		}
		val = arr.length - count;
		return val;
		
	}
					//		int i = 0;
					//
					//	    for (final int num : nums)
					//	      if (num != val)
					//	        nums[i++] = num;
					//
					//	    return i;
					//	}

	
	
}
