package com.practice.leedCodeArrays;

import java.util.Arrays;

public class RightRotateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 }; // output ::: 4,5,1,2,3
		int k = 2;
//		rightRotate(arr, k);
		System.out.println(Arrays.toString(rightRotate(arr, k)));
	}

	public static int[] rightRotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;  // k=times of rotate % length :::  18 % 5 == 3 
		int r = n - k;  // r mean skip start index and than start into specific position :: 2
		int outArr[] = new int[n];
		for (int i = 0; i < n; i++) {
			int index = (i + r) % n; 
			outArr[index] = arr[i];
		}
		return outArr;
	}
}
