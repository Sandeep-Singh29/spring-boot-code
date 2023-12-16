package com.practice.Array;

public class CountPairsOfArray {

	public static void main(String[] args) {
		int arr[] = {1,1,1,1}; /* 3 */ 
		int k = 2;
//		countPair(arr , k);
		System.out.println(countPair(arr , k));
	}
	
	public static int countPair(int[] arr, int k) {
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if (arr[i]+arr[j]==k) {
					count++;
				}
			}
		}
		return count;
	}

}
