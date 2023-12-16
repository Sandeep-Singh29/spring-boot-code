package com.practice.leedCodeArrays;

public class MonotonicArray {

	public static void main(String[] args) {
		int[] nums = { 1,4,3 }; // output :: false
		System.out.println(isMonotonic(nums));
	}

	public static boolean isMonotonic(int[] nums) {
		boolean insc = true;
        boolean desc = true;
        for(int i=0; i<nums.length-1; ++i){
            if(nums[i] > nums[i+1])
                insc = false;
            if(nums[i] < nums[i+1])
                desc = false;
        }
        return insc || desc;
	}
}
