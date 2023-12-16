package com.practice.leedCodeArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1 ,2,3,1};
//		containsDuplicate(nums);
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<nums.length; i++) {
			map.putIfAbsent(nums[i], 0);
			map.put(nums[i], map.get(nums[i])+1);
			if (map.get(nums[i])>1) {
				return true;
			}
		}
		return false;
		
//		Appriach 1
		
//		Set<Integer> seen = new HashSet<>();
//
//		for (final int num : nums)
//			if (!seen.add(num))
//				return true;
//
//		return false;
// 
//		Approach 2
		
		// List<Integer> list = new ArrayList<>();
		// for (int i = 0; i < nums.length; i++) {
		// if (!list.contains(nums[i])) {
		// list.add(nums[i]);
		// } else {
		// return true;
		// }
		// }
		// return false;
		
//		Appriach 3
			

	}
}
