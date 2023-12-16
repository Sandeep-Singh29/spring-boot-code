package com.practice.Array;

public class FindMissingNumber {

	public static void main(String[] args) {
		int []arr = {0,1,2,3,5};
		int length = arr.length-1;
//		missingNumber(arr,length);
		System.out.println(missingNumber(arr,length));	
	}

	
//	 public static int missingNumber(int array[], int n) {
//		 int missing = 1;
//	        for(int i =0; i<n; i++) {
//				for(int j=i+1; j<n; j++) {
//					missing = array[i]+array[j];
//					if (!(missing==array[j+1])) {
//						return missing;
//					}
//				}
//			}
//			return missing;
//	    }
	
	public static int missingNumber(int arr[], int n) {
//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		int total = 0;
//		for (int i = 1; i <= max; i++) {
//			total += i;
//		}
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			count += arr[i];
//		}
//		int ans = total - count;
//		if (ans == 0) {
//			return max + 1;
//		}
//		return ans;
		
		 boolean[] app = new boolean[arr.length + 1];
	        for (int i = 0; i < arr.length; i ++) {
	            app[arr[i]] = true;
	        }
	        for (int i = 0; i < app.length; i ++) {
	            if (!app[i]) {
	                return i;
	            }
	        }
	        return 0;
		
	}
	 
	 
}
