package com.interview;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.println("2");
			System.out.println("3");
			for (int i = 2; i <= n; i++) {

				if (i % 2 != 0 && i % 3 != 0) {

					System.out.println(i);

				}
			}
		}
	}
}
