package com.practice.Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class KthSmallestElement {

	public static void main(String[] args) {
		
		int []arr = {7 ,10, 4 ,3 ,20 ,15};
//		int len = arr.length;
		int k = 3;
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println("Smallest Kth Element is ::  "+arr[k-1]);
//		System.out.println("Largest Kth Element is ::  "+arr[arr.length-k]);
		k--;
		Set<Integer> s = new TreeSet<>();
		
		for(int i : arr) {
			s.add(i);
		}
//		System.out.println(s);

		
		Iterator<Integer> it = s.iterator();
		while(k>0) {
			it.next();
			k--;
		}
		System.out.println("Smallest Kth Element is :: "+it.next());
	}
}
