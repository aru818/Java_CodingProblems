package com.string.java;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringMethod {
	public static void main(String[] args) {
		StringJoiner str = new StringJoiner(",", "[", "]");
		str.add("sdm");
		str.add("arvind");
		str.add("kumar");
		System.out.println(str);

		String string = "arvinkumarchaurasia";

		byte[] bytes = string.getBytes();
		System.out.println(Arrays.toString(bytes));

	}
}
