package com.practice.leedCodeArrays;

public class SingleNumber {
	public static void main(String[] args) {
		int arr[] = {2,2,3,3,4,6,4,5,5};  //output :: 1
//		singleNumber(arr);
		System.out.println(singleNumber(arr));
	}
	 public static int singleNumber(int[] nums) {
		 int ans = 0;

		    for (final int num : nums)
		      ans ^= num;

		    return ans;
		 
	    }
}
