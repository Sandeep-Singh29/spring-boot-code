package com.practice.Array;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8};
		int n = arr.length;
		int s = 14;
//		subarraySum(arr, n, s);
		System.out.println(subarraySum(arr, n, s));
		
	}
	public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
//		1,2,3,4,5,6,7,8
		List<Integer> list = new ArrayList<>();
		int sum =0;
		int count =0;
		int start=0;
		int end =0;
		for(int i=count; i<n; i++) {
			sum+=arr[i];
			if (sum<s) {
				list.add(arr[i]);
			}
			if (sum==s) {
				list.add(arr[i]);
				return (ArrayList<Integer>) list;
			}
			if (sum>s) {
				sum=0;
				list = new ArrayList<>();
				count++;
				i=count;
				i--;
			}
		}
		return (ArrayList<Integer>) list;
       
    }
}	
