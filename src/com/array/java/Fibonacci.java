package com.array.java;
public class Fibonacci {
public static void main(String[] args) {
int first=0;
int second =1;
int n=15;

for(int i=0; i<n; i++) {
	System.out.println(first+ " ");
	int next= first+second;
	 first= second;
	 second=next;
	
}
	
	
	
	
}
}
