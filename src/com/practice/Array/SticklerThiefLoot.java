package com.practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SticklerThiefLoot {

	public static void main(String[] args) {
		int arr[] = {9 ,4, 1 ,12, 6 ,1}; /* Even :: 6+5+4+2+8= 25; odd :: 5+7+4+6+5= 27; */
		int n = arr.length;
//		FindMaxSum(arr,n);
		System.out.println(FindMaxSum(arr,n));
	}
	
	
	
	public static int FindMaxSum(int arr[], int n){
        int take = 0;
        int notTake = 0;
        
        for(int val : arr){
            int newTake = notTake + val;
            int newNotTake = Math.max(take , notTake);
            
            take = newTake;
            notTake = newNotTake;
        }
        
        return Math.max(take , notTake);
	}
}
