package com.practice.Array;

public class SortNumericValue {
	
	public static void main(String[] args) {
		int arr[] = {8,6,43,3,6,14,34,32,1,9,45};
		getSortArray(arr);
	}
	
	public static int[] getSortArray(int []arr) {
		int temp = 0;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1 ; j<arr.length-1;j++) {
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
			System.out.print(arr[i]+ ",");
		}
		
		return arr;
	}

}
