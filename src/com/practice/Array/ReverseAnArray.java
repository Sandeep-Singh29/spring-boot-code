package com.practice.Array;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7, 8 };
		for (int i = 1; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
