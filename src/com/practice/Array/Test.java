package com.practice.Array;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		long a[] = {1, 345, 234, 21, 56789};
		long n = a.length;
		System.out.println(getMinMax(a, n));
		int nums[] = {3,2,4};
		int target = 6;
		int[] result= twoSum(nums,target);
		System.out.println(result[1]+", "+result[0]);
		
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
	
//		Map<Integer, Integer> numMap = new HashMap<>();
//		 for (int i = 0; i < nums.length; i++) {
//	            numMap.put(nums[i],i);;
//	        }
//		 
//		 for (int i=0; i<nums.length;i++) {
//			 int secondPart = target-nums[i];
//			 if(numMap.containsKey(secondPart)) {
//				 return new int[] {i,numMap.get(secondPart)};
//			 }
//			 
//		 }
//		 return new int[] {-1,-1};
		
		Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found

			
}
	

	public static Pair getMinMax(long a[], long n) {
		long min = a[0];
		long max = a[0];
		for (int i = 0; i < n; i++) {
			if (min > a[i]) {
				min = a[i];
			}if (max < a[i]) {
				max = a[i];
			}
		}
		return new Pair(min, max);
	}
}


	class Pair {
		long first, second;

		public Pair(long first, long second) {
			this.first = first;
			this.second = second;
		}
	}

