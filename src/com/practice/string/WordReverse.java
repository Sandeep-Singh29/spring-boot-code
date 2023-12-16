package com.practice.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class WordReverse {

	public static void main(String[] args) {
		reverseWords("san/deep/sing/kush");

	}

	public static String reverseWords(String S){
		String replace =S.replace(".","/");
        String []splidata = replace.split("/");
		Collections.reverse(Arrays.asList(splidata));
		String string = Arrays.toString(splidata);
		String finalData = string.replace(",",".");
		System.out.println(finalData);
		String valueOf = String.valueOf(finalData);
		System.out.println(valueOf);
		
		return finalData;
     
    }
	
}
