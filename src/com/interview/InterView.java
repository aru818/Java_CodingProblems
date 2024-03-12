package com.interview;

public class InterView {
	public static void main(String[] args) {
		String str = "arvind kumar";
		String[] arr = str.split(" ");
		StringBuilder reverse = new StringBuilder();
		for (String word : arr) {

			StringBuilder reverseStr= new StringBuilder(word).reverse();
			reverse.append(reverseStr).append(" ");

		}
		reverse.toString().trim();
		System.out.println(reverse.toString());
	}

}
