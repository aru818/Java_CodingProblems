package com.others.java;

public class StaticKeyword {
	

	public StaticKeyword(int id, String student) {
		super();
		this.id = id;
		this.student = student;
	}

	static String collegeName ;
	// static variabl3e need not to call everytime
	
	int id ;
	String student = "Arvind";
	
	public static void m1() {
	
	 collegeName= "gniot";	
		
	//static variable can only calls 	
		
	}

	public static void main(String[] args) {
		StaticKeyword st = new StaticKeyword(12, "rohit");

	}
}
