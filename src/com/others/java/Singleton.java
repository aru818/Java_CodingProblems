package com.others.java;

//longest substring without repeat char
//String is Anagram or not
//missing no from the consecutive series
//Occurrence of character
//is palindrome 
//replace char at any point
//how to make singleton class
public class Singleton {
	private static Singleton singleton = null; // giving null initially

	String string;

//lazy loading
	public static void main(String[] args) {

		// to show that both the instances are same
		System.out.println(getInstance());
		
		System.out.println(getInstance());
		
		// to print constructor values
		getInstance();
		getInstance();
	}

	private Singleton() {
		string = "hello guys";
		System.out.println(string);
	}

	{

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}

		return singleton;
	}

}
