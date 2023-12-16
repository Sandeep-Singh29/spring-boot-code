package com.practice.string;

public class RemoveColoredPieces {
	public static void main(String[] args) {
		String s = "AAAAAAA";  // Alive = 'A' & BOB = 'B'; Count:: A=1 ; so Alice Win   AAABBBBAA
//		winnerOfGame(s);
		System.out.println(winnerOfGame(s));
	}

	public static boolean winnerOfGame(String colors) { // AAAABBBBBBAAA
		int countAAA = 0;
		int countBBB = 0;
		for (int i = 1; i + 1 < colors.length(); ++i)
			if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1))
				if (colors.charAt(i) == 'A')
					++countAAA;
				else
					++countBBB;

		return countAAA > countBBB;
		
//		int countA = 0;
//		int countB =0;
//		int A = 0;
//		int B =0;
//		int leftRight = 2;
//		for(int i=0; i<colors.length(); i++ ) {
//			if (String.valueOf(colors.charAt(i)).equals("A")) {  //"AAABBBBAAA"
//				countA++;
//				if (countA==3) {
//					countA = countA-leftRight;
//					A += countA;
//					countA = countA+leftRight;
//				}
//				if (countA>3) {
//					A=0;
//					countA = countA-leftRight;
//					A += countA;
//				}
//				countB=0;
//			}else if (String.valueOf(colors.charAt(i)).equals("B")) {
//				countB++;
//				if (countB==3) {
//					countB = countB-leftRight;
//					B += countB;
//					countB = countB+leftRight;
//				}
//				if (countB>3) {
//					B=0;
//					countB = countB-leftRight;
//					B += countB;
//				}
//				countA=0;
//			}
//		}
//		return A>B ? true : false;

	}
}
