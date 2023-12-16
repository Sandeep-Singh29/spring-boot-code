package com.practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestSortedArray {

	public static void main(String[] args) {

//			1, 3 ,5 , 8, 2,  9,  6, 7,  9, 15, 20, 22, 25, 4, 35, 1
//			1, 3 ,5 , 8 // 2,  9 // 6, 7,  9, 15, 20, 22, 25 // 4, 35,35 // 25 // 1
//			int []arr = {1, 2,  6,7,8, 22, 25,26, 4, 35,35,36,46};
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
//			
//			for(int i=0;i<arr.length-1;i++) {
//				if(arr[i]<=arr[i+1]) {
//					list1.add(arr[i]);
//				}else {
//					list1.add(arr[i]);
//					if(list1.size()>list2.size()) {
//						list2 = list1;
//					}
//					list1 = new ArrayList<>();
//				}
//			}
//			if(arr[arr.length-2]<arr[arr.length-1]) {
//				list1.add(arr[arr.length-1]);
//			}
//			if(list1.size()>list2.size()) {
//				list2 = list1;
//			}
//			System.out.println(list2);

		int[] arr = { 1, 3, 5, 8, 2, 9, 1, 2, 3, 4, 5, 6, 4 };
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] <= arr[i + 1]) {
				list1.add(arr[i]);
			} else if (arr[i] >= arr[i + 1] && !(arr[i] <= arr[i + 1])) {
				list1.add(arr[i]);
				if (list1.size() > list2.size()) {
					list2 = list1;
				}
				list1 = new ArrayList<>();
			}
			i++;
		}
		if (arr[arr.length - 2] < arr[arr.length - 1]) {
			list1.add(arr[arr.length - 1]);
		}
		if (list1.size() > list2.size()) {
			list2 = list1;
		}
		System.out.println(list2);
		System.out.println(list2.size());

			 List<Integer> data = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			 System.out.println(data);
			 Integer integer = data.stream().distinct().skip(1).findFirst().get();
			 System.out.println(integer);
	}

}
