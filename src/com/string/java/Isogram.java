package com.string.java;

public class Isogram {
	public static void main(String[] args) {
		String str = "Heyman";
		boolean isogram = isIsogram(str);
		System.out.println(isogram);
	}

	public static boolean isIsogram(String str) {

		char[] arr = str.toLowerCase().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return false;
				}

			}

		}
		return true;

	}
}
