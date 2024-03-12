package com.string.java;

public class ReverseSentance {
	public static void main(String[] args) {
		String str = "my name is arvind";
		// output= arvind is name my
		String[] words = str.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print((words[i]+" "));
		}
	}
}
