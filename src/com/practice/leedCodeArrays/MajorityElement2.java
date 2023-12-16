package com.practice.leedCodeArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
	public static void main(String[] args) {
		int arr[] = {1,2};
		majorityElement(arr);
	}

	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int len = nums.length/3;
		for(int i=0;i<nums.length;i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}else {
				map.put(nums[i], map.get(nums[i])+1);
			}
		}
		for(int k : map.keySet()) {
			if (len<map.get(k)) {
				list.add(k);
			}
		}
		System.out.println(list);
		return list;

	}
}
