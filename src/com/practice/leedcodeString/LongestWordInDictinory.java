package com.practice.leedcodeString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestWordInDictinory {

	public static void main(String[] args) {
		String str[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
//		longestWord(str);
		System.out.println(longestWord(str));
	}

	public static String longestWord(String[] words) {
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
        String result=new String();
       Set<String> set = new HashSet<>();
        for(String word:words){
            if(word.length()==1 || set.contains(word.substring(0,word.length()-1))){
                if(word.length()>result.length())
                result=word;
                set.add(word);
            }
        }
        return result;
		
		/* 
		
		Arrays.sort(words, (a, b) -> a.length() - b.length()); // sort words by non-decreasing length
		HashMap<String, Boolean> goodWords = new HashMap<>(); // lookup for good words
		int maxLength = 0;
		String ans = "";
		for (String word : words) {
			if (word.length() == 1) {
				goodWords.put(word, true);
			} else if (goodWords.containsKey(word.substring(0, word.length() - 1))) {// word with length - 1 prefix is good
				goodWords.put(word, true);
			}
			if (goodWords.containsKey(word)) {
				if (maxLength < word.length()) { // find longer word
					maxLength = word.length();
					ans = word;
				} else if (maxLength == word.length() && ans.compareTo(word) > 0) { // find lexicographically smaller 																				 word
					ans = word;
				}
			}
		}
		return ans;
		
		*/
	}
}



//
//
//Arrays.sort(words);
//int j=0;
//int i =0;
//for(i=1; i<words.length;i++) {
//	if (String.valueOf(words[i]).contains(String.valueOf(words[j]))) {
//		j++;
//	}
//}
//return j+1 == words.length-1 ? words[i].toString() : words[j];
