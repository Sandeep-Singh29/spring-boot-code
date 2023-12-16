package com.practice.leetcode_75;

public class MergeStringAlternative_1768 {

	public static void main(String[] args) {
		String word1 = "aceg";
		String word2 = "bdfhij";
		String mergeAlternately = mergeAlternately(word1,word2);
		System.out.println(mergeAlternately);
		
	}
	
	
	public static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        int len=0;
        if (l1>l2) {
			len = l1;
		}else {
			len = l2;
		}
        for(int i=0;i<len;i++) {
        	char[] w1 = word1.toCharArray();
        	char[] w2 = word2.toCharArray();
        	if(i<l1){
        		str.append(w1[i]);
        	}
        	if(i<l2) {
        		str.append(w2[i]);
        	}
        }        
		return String.valueOf(str);
    }
	
}
