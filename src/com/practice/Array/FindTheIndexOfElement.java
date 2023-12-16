package com.practice.Array;

import java.util.Arrays;
import java.util.Iterator;

public class FindTheIndexOfElement {

	public static void main(String[] args) {
		int arr[] = {1,4,2,6,4,8,35,5};
		int search = 35;
//		getElementIndex(arr,search);
		System.out.println("Index Of :: "+search+" is  "+getElementIndex(arr,search));
		int newArray[] = new int[arr.length];
		getCopyValueToAnotherArray(arr,newArray);
	}
	
	public static String getElementIndex(int[] arr, int search) {
		for(int i=0; i<arr.length; i++) {
			if (arr[i]==search) {
				return String.valueOf(i);
			}
		}
		return "Not Found";
	}
	
	public static void getCopyValueToAnotherArray(int[]arr , int[]newArray) {
		
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		System.out.println("New Array :: "+Arrays.toString(newArray));
	} 
	
}
