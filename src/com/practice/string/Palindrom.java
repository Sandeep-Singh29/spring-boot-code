package com.practice.string;

public class Palindrom {

	public static void main(String[] args) {
//		isPalindrome("deed");
//		isPalindrome1("dad");
//		System.out.println(isPalindromm("taatd"));
//		System.out.println(isPalindrome("deed"));
		System.out.println(getpalindrom("madam"));

	}

	public static int isPalindrome1(String S) {
		String data = "";
		for (int i = S.length() - 1; i >= 0; i--) {
			data = data + S.charAt(i);
		}
		if (S.equals(data)) {
			System.out.println("Palindrom");
			return 1;
		} else {
			System.out.println("Not Palindrom");
			return 0;
		}
	}
	
	public static int isPalindrome(String S) {
			StringBuilder builder = new StringBuilder(S);
			String reverse = String.valueOf(builder.reverse());
			if (reverse.equals(S)) {
				return 1;
			}
		return 0;
	}

	public static String isPalindromm(String str) {
		int i = 0;
		int j = str.length() - 1;
		boolean isPalindrom = true;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalindrom = false;
				break;
			}
			i++;
			j--;
		}
		if (isPalindrom == true) {
			return "palindrom  :: " + str;
		} else
			return "Not Palindrom ::  " + str;
	}
	
	
	private static String getpalindrom(String name) {
		for(int i=0; i<name.length()-1;i++) {
			if (!String.valueOf(name.charAt(i)).equals(String.valueOf(name.charAt(name.length()-1-i)))) {
				return "false";
			}
		}
		return "true";
	}


}
