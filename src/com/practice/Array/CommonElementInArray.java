package com.practice.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CommonElementInArray {

	public static void main(String[] args) {
		
		int []a = {1 ,5, 10,15, 10,10, 20, 40, 80};
		int []b = {6, 7, 20,20,20, 80,15, 100};
		int []c = {3, 4, 15,15,15,20, 30, 70, 80, 120};
		int al = a.length;
		int bl = b.length;
		int cl = c.length;
//		commonElements(a, b, c, al, bl, cl); /* Output :: 20 80 */
		System.out.println(commonElements(a, b, c, al, bl, cl));
	}
	
	
	public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
//		Set<Integer> list = new LinkedHashSet<>();
//		for(int i=0; i<n1; i++) {
//			for(int j=0; j<n2; j++) {
//				for(int k=0; k<n3; k++) {
//					if ((A[i]==B[j] && B[j]==C[k]) ) {
//						list.add(A[i]);
//					}
//				}
//			}
//		}
//		List<Integer> list1 = new ArrayList<>(list);
//        return (ArrayList<Integer>) list1;
		
		Set<Integer> set1 = new LinkedHashSet<>();
		Set<Integer> set2 = new LinkedHashSet<>();
		Set<Integer> set3 = new LinkedHashSet<>();
		List<Integer> al = new ArrayList<>();
		for (int i = 0; i < n1; i++) {
			set1.add(A[i]);
		}
		for (int i = 0; i < n2; i++) {
			set2.add(B[i]);
		}
		for (int i = 0; i < n3; i++) {
			set3.add(C[i]);
		}
		   Iterator<Integer>iterator=set1.iterator();
	        while(iterator.hasNext())
	        {
	            int ele=iterator.next();
	            if(set2.contains(ele) && set3.contains(ele))
	            {
	                al.add(ele);
	            }
	        }
	        return (ArrayList<Integer>) al;

    }
}
