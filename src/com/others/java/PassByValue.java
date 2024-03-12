package com.others.java;

// java pass by value 
public class PassByValue {

	public int i = 1;

	public void m(PassByValue a) { // here we have new instance of A, so i again change into 1

		a.i = 10; // i become 10 
		
// remember for this instance of A, the value will remain 10 only
		a = new PassByValue(); //  new object created, i become 1
		a.i = 100; // i become 100

	}

	public static void main(String args[]) {
		PassByValue a = new PassByValue(); // program starts from here
		// while creating new object copy of instance
		// variable is provided, i=1
		a.i = 5; // i become 5
		a.m(a);// call will reach to method m,
		// while returning back we have the value of i=10
		System.out.println(a.i); // here 10 will be output
		
		
		
		
		/* 1. note on every instance we will have separate copy of the variables, original variable
		 * will not change if you make again instance of the variable you will get fresh copy of the instance variable
		 * 
		 * 2. scope of value of method variable is inside method only. it wont affect outside or other method value for same variable
		 * 
		 * */

		
		
		/*
		 * a.i = 10;: it set the value of the instance variable i of the object passed
		 * as a parameter to 10. Changes made here affect the original object.
		 * 
		 * a = new A();: This creates a new instance of class A and assigns it to the
		 * reference variable a. This assignment does not affect the original object
		 * outside the method.
		 * 
		 * a.i = 100;: This sets the value of the instance variable i of the newly
		 * created object to 100. This modification is local to the method and does not
		 * affect the original object.
		 * 
		 * System.out.println(a.i); This prints the value of the instance variable i of
		 * the original object referenced by a. The output is 10, not 5, because the
		 * changes made inside the m method affect the original object.
		 * 
		 */
	}

}