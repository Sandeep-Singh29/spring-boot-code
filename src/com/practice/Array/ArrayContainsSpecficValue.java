package com.practice.Array;

public class ArrayContainsSpecficValue {

	public static void main(String[] args) {
		int arr[] = {1,3,42,2,6,3,7,3,85,14};
		int searchNum = 85;
//		getSpecificValue(arr,searchNum);
		System.out.println(getSpecificValue(arr,searchNum));
	}
	
	public static boolean getSpecificValue(int[] arr ,int search) {
		for(int i=0; i<arr.length;i++) {
			if (arr[i]==search) {
				return true;
			}
		}
		return false;
	}
}
