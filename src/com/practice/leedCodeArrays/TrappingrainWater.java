package com.practice.leedCodeArrays;

import java.util.Iterator;

public class TrappingrainWater {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		trap(arr);
	}

	public static int trap(int[] height) {
		int n = height.length;
		int max = 0;
		int maxIndex = 0;
		int totalWater = 0;
//		FindMax Index
		for (int i = 0; i < n; i++) {
			if (height[i] > max) {
				max = height[i]; // top most building
				maxIndex = i;
			}
		}
		int leftmax = 0;
		// Part 1
		for (int i = 0; i < maxIndex; i++) {
			leftmax = Math.max(leftmax, height[i]);
			int water = Math.min(leftmax, max) - height[i];
			totalWater += water;
		}
		
		leftmax =0;
		
		// Part 1
		for (int i = n-1; i>maxIndex; i--) {
			leftmax = Math.max(leftmax, height[i]);
			int water = Math.min(leftmax, max) - height[i];
			totalWater += water;
		}
		System.out.println(totalWater);
		return totalWater;

		/* Approach 2 */

		/*
		 * int n = height.length; int[] leftMax = new int[n]; int[] rightMax = new
		 * int[n]; int max = 0; int totalWater = 0;
		 * 
		 * // LeftMax for (int i = 0; i < n; i++) { max = Math.max(max, height[i]);
		 * leftMax[i] = max; }
		 * 
		 * max =0; // max 0 due to we have find the both left and right building
		 * 
		 * // rightMax for (int i = n-1; i >=0; i--) { max = Math.max(max, height[i]);
		 * rightMax[i] = max; } // Count totalk water storage for (int i = n - 1; i >=
		 * 0; i--) { int water = Math.min(leftMax[i], rightMax[i])-height[i]; totalWater
		 * += water; } System.out.println(totalWater); return totalWater;
		 */
	}
}
