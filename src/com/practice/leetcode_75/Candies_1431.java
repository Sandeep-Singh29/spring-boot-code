package com.practice.leetcode_75;

import java.util.ArrayList;
import java.util.List;

public class Candies_1431 {
	public static void main(String[] args) {

		int arr[] = { 12,1,12 };
		int candy = 10;
		List<Boolean> kidsWithCandies = kidsWithCandies(arr, candy);
		System.out.println(kidsWithCandies);

	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		for (int num : candies) {
			max = Math.max(num, max);
		}
		List<Boolean> bool = new ArrayList<>();
		for (int i = 0; i < candies.length; i++) {
			int sum = 0;
			sum = candies[i] + extraCandies;
			if (sum >= max) {
				bool.add(true);
			} else {
				bool.add(false);
			}

		}
		return bool;
	}

}
