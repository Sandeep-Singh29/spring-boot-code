package com.practice.string;

public class ReverseWords {

	public static void main(String[] args) {
		String data = "i.like.this.program.very.much";
		 String reverseWords = getReverseWords(data);
		System.out.println(reverseWords);
	}

	private static String getReverseWords(String data) {
		String value ="";
		String[] d = data.split("[.]");
		for(int i=d.length-1; i>=0; i--) {
		  if (i>0) 
			  value+= d[i] + ".";
		else {
			value+= d[i] + "";
		}
		}
		return value;
	}

}
