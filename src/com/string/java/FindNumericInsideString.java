package com.string.java;

public class FindNumericInsideString {

	public static void main(String[] args) {
		String str = "abcd1233";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			/*char c = str.charAt(i);
			if (Character.isDigit(c)) {
				builder.append(c);}*/
			
		}
		//System.out.println(builder.toString());
		String replaceAll = str.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
	}
}
