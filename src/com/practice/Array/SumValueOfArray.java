package com.practice.Array;

public class SumValueOfArray {
	
	public static void main(String[] args) {
		
		int []arr = {2,4,1,15,21,16,7};
//		getSumOfValue(arr);
//		System.out.println(getSumOfValue(arr));
		System.out.println("Average Of An Array  :: "+getAverageOfValue(arr));
		
		/*-----------------*/
		
		
		System.out.println();
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=0; j--) {
				System.out.print("-"+" ");
			}
			System.out.println();
		}
		
	}
	
	public static int getSumOfValue(int [] arr){
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		return sum;
	}
	
	public static double getAverageOfValue(int [] arr){
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		int length = arr.length;
		double average = sum / length; /* If we are Using Double wrapper Class tha We type Casting */
		return average;
	}
	

}
