package com.practice.leedCodeArrays;

import java.util.ArrayList;
import java.util.List;

public class IntegerBreak {

	public static void main(String[] args) {
		int n = 20;
//		integerBreak(n);
		System.out.println(integerBreak(n));
	}

	public static int integerBreak(int n) {  // 3+3+3+3+3+3+2   = 3*3*3*3*3*3*2 = 1458
		if (n==2) 
			return 1;
		if (n==3) 
			return 2;
		int ans =1;
		while(n>4) {
			ans = ans*3;
			n = n-3;
		}
		ans = ans*n;
		return ans;
	}
}
