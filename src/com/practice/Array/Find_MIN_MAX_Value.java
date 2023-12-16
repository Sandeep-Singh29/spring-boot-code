package com.practice.Array;

import java.util.Arrays;

public class Find_MIN_MAX_Value {

	public static void main(String[] args) {
		int []arr = {1,8,4,23,45,22,99,1,6,3,65,23,85};
		int min =arr[0];
		int max =arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Min : "+min + " , Max : "+max);
	}
}
