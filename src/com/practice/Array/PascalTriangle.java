package com.practice.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		int a = 5;
		generate(a);
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> finalList = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		if (numRows == 0) {
			return finalList;
		}

		for (int i = 0; i < numRows; i++) {
			list.add((int) Math.pow(11, i));
			finalList.add(list);
			list = new ArrayList<>();
		}
		System.out.println(finalList);
		return finalList;

	}
}
