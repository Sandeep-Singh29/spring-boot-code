package com.practice.Array;

import java.util.Arrays;

public class InsertElementInSpecificIndex {

	public static void main(String[] args) {
		int[]arr = {3,2,5,2,7,8,6,67};
		insert(arr, 4, 20);
		int []insertArr = new int[arr.length+1];
		int insertIndex = 4;
		int insertElement = 10;
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			if (i==insertIndex) {
				insertArr[i] = insertElement;
			}if(i==insertIndex) {
				temp = arr[i];
				insertArr[i+1] = temp ;
			}else if (i>insertIndex) {
				insertArr[i+1] = arr[i];
			}else {
				insertArr[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(insertArr));
		
		
		System.out.println("----------------------------");
		
//		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
//		int Index_position = 2;
//		int newValue = 5;
//		System.out.println("Original Array : " + Arrays.toString(my_array));
//
//		for (int i = my_array.length-1; i > Index_position; i--) {
//			my_array[i] = my_array[i - 1];
//		}
//		my_array[Index_position] = newValue;
//		System.out.println("New Array: "+Arrays.toString(my_array));
	}
	// 1,2,3,4,5,6
	public static void insert(int[] arr, int index, int value) {
		int[] newarr = new int[arr.length+1];
		int c = 0;
		for(int i=0;i<arr.length;i++) {
			if(i==index) {
				newarr[c++]=value;
				index--;
				i--;
			}else {
				newarr[c++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
}
