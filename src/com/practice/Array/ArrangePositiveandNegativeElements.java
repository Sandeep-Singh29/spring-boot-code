package com.practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrangePositiveandNegativeElements {

	public static void main(String[] args) {
		int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};  // OUTPUT ::  9 -2 4 -1 5 -5 0 -3 2
		int n = arr.length;
//		rearrange(arr,n);
		System.out.println(Arrays.toString(rearrange(arr,n)));
	}
	
	public static int[] rearrange(int[] a , int n) {
		int []arrange = new int[a.length];
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		for(int i=0; i<n; i++) {
			if (a[i]<0) {
				list.add(a[i]); 
			}else {
				list1.add(a[i]); 
			}
		}
		int i=0;
		int j=0;
		int k=0;
		while(i<list.size() || j<list1.size()) {
			if (j<list1.size()) {
				arrange[k++] = list1.get(j);
				j++;
			}
			if (i<list.size()) {
				arrange[k++] = list.get(i);
				i++;
			}
		}
		for(int l=0;l<n;l++) {
			a[l] = arrange[l];
		}
		System.out.println("a  " +Arrays.toString(a));
		return arrange;
	}
}
