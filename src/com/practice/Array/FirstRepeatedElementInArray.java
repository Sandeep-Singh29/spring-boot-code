package com.practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstRepeatedElementInArray {

	public static void main(String[] args) {
		int a[] = {2, 5, 3, 4, 3, 5, 6}; /* OutPut :: 1  if not return -1*/
		int n = a.length;
//		getRepeatedElement(a,n);
		System.out.println(getRepeatedElement(a,n));
	}
	
	public static int  getRepeatedElement(int[] arr , int n) {
		Map<Integer, Integer> map = new HashMap<>();
		int index = n; //2, 5, 3, 4, 3, 5, 6
		for (int i = 0; i < n; i++) {
			if(map.containsKey(arr[i])) {
				int temp = map.get(arr[i])+1;
				if(temp<index) {
					index = temp;
				}
			}else {
				map.put(arr[i], i);
			}
		}
		if(index!=n) return index;
		return -1 ;
	}
	
}
