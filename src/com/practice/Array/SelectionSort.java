package com.practice.Array;

import java.util.Arrays;

public class SelectionSort {
 
	public static void main(String[] args) {
		int []arr = {5,2,1,6,3,4};
		int n = arr.length;
		sortArray(arr , n);
	}
	
	public static int[] sortArray (int[] arr , int n) {
//		5,2,1,6,3,4
		int smaller =0;
		int temp =0;
		for(int i=0; i<n; i++) {
			smaller = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j]<arr[smaller]) {
					smaller = j;
				}
			}
			temp = arr[smaller];
			arr[smaller] = arr[i];
			arr[i] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
