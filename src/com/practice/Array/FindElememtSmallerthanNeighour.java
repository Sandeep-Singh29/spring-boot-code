package com.practice.Array;

import java.util.Arrays;
import java.util.Iterator;

public class FindElememtSmallerthanNeighour {

	public static void main(String[] args) {
		int arr[] = {4, 3, 20, 4, 9, 0};
		
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		int peak = arr[arr.length-1];
		System.out.println(peak);
		
		
		
	}
}
