package com.string.java;

public class FindSpecialChar {

	public static void main(String[] args) {

		String str = "Arvind@123_ kk";

		int count = 0;
		
		char[] arr = str.toLowerCase().toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (!Character.isAlphabetic(c) && !Character.isWhitespace(c)
					&& !Character.isDigit(c)) {

				count++;

			}

		}
		System.out.println(count);
	}
}
