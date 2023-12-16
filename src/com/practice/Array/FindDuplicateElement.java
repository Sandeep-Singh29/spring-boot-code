package com.practice.Array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,3,4,1,1,1};
		int n = arr.length;
//		duplicates(arr, n);
		System.out.println(duplicates(arr, n));
	}
	
	 public static ArrayList<Integer> duplicates(int arr[], int n) {
		 List<Integer> list = new ArrayList<>();
//		 for(int i=0; i<n-1; i++) {
//			 for(int j=i+1; j<n; j++) {
//			 if (arr[i]==arr[j]) {
//				list.add(arr[i]);
//			}
//		 }
//		 }
//		 if (!list.isEmpty()) {
//			return (ArrayList<Integer>) list;
//		}else {
//			list.add(-1);
//			return (ArrayList<Integer>) list;
//		}
		 for (int i = 0; i < n; i++) {
	            int index = arr[i] % n;
	            arr[index] += n;
	        }
	 
	        for (int i = 0; i < n; i++) {
	            if (arr[i] / n >= 2) {
	            	list.add(i);
	            }
	        }
	        return (ArrayList<Integer>) list;
	    }
	 	
		
}
