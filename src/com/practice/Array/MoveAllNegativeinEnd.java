package com.practice.Array;

import java.util.Arrays;

public class MoveAllNegativeinEnd {

	public static void main(String[] args) {
		int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 }; /* Output :: 1 3 2 11 6 -1 -7 -5 */
		int length = arr.length;
		segregateElements(arr,length);
	}
	
	public static void segregateElements(int arr[], int n){
		int []newArr = new int[arr.length];
        int index =0;
       for(int i=0; i<n; i++){
           if(arr[i]>0){
              newArr[index++] = arr[i];
           }
       }
       
       for(int i=0; i<n; i++){
           if(arr[i]<0){
              newArr[index++] = arr[i];
           }
       }
		System.out.println(Arrays.toString(newArr));
    }
}
