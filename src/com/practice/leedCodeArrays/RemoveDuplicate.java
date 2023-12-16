package com.practice.leedCodeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String[] args) {  // 1,2,3,5,,4,2,11,1,1,1,2,2,2,2
		int arr[] = {1,2,3,5,4,2,11,1,1,1,2,2,2,2};
		getRemoveArray(arr);
	}
	
	public static int[] getRemoveArray(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		List<Integer> list = new ArrayList<>();
		int j =0;
		for(int i=1;i<arr.length;i++) {
			if (!(arr[j]==arr[i])) {
				list.add(arr[j]);
				j++;
			}else {
				j++;
			}
		}
		list.add(arr[j]);
//		System.out.println(Arrays.toString(list.toArray()));
		int []result = new int[list.size()];
		for(int i=0; i<list.size();i++) {
			result[i] = list.get(i);
		}
		System.out.println(Arrays.toString(result));
		return result;
		
	}
}
