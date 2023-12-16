package com.practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndexValue {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int arr[] = {4,2,5,6,65,2,4,76,2,10};
		int n = arr.length;
		int j =0;
		for (int i = 1; i <=arr.length; i++) {
			if (arr.length != i) {
				if (i == arr[i - 1]) {
					list.add(arr[i-1]);
				}
			} else {
				if (i == arr[i-1]) {
					list.add(arr[i-1]);
				}
			}
		}
		System.out.println(list);
	}
}
