package com.string.java;

public class ReverseStringg {
	public static void main(String[] args) {
		String str = "arvindrajput";
		char[] arr = str.toCharArray();
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			char c = arr[left];
			arr[left] = arr[right];
			arr[right] = c;
			left++;
			right--;

		}
		for (char s : arr) {
			System.out.print(s);
		}

	}
}
