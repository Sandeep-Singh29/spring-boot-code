package com.practice.string;

public class ToggleWords {
//	phYSiCs  -> PHysIcS
	public static void main(String[] args) {
		getToggleWord("phYSiCsabc@4");
		getToggleWordUsingForEach("Sande EEp SinGH");
		System.out.println(getToggleWord("rOhIt"));
		
	}

	public static String getToggleWord(String str) {
		String data = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if ((int) ch >= 97 && (int) ch <= 122) { /* small Letter */
				String upperCase = String.valueOf(ch);
				data = data + upperCase.toUpperCase();
			}else if ((int)ch>=60 && (int)ch<=90) { /* caps Letter */
				String lowerCase = String.valueOf(ch);
				data = data + lowerCase.toLowerCase();
			} 
		}
//		System.out.println("Orginal String  "+str);
		return data;
	}
	
	public static StringBuilder getToggleWordUsingForEach(String str) {
		System.out.println(str);
		StringBuilder ans = new StringBuilder();
		for(String name : str.split("")){
			if (name.equals(name.toLowerCase())) {
				ans = ans.append(name.toUpperCase());
			}else {
				ans = ans.append(name.toLowerCase());
			}
		}
		return ans;
	}
	
	
}
