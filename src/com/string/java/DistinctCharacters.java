package com.string.java;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharacters {
	    public static void main(String[] args) {
	        String inputString = "hello world";
	        Set<Character> distinctChars = findDistinctCharacters(inputString);
	        System.out.println("Distinct characters in the string \"" + inputString + "\":");
	        for (char c : distinctChars) {
	            System.out.print(c + " ");
	        }
	    }

	    public static Set<Character> findDistinctCharacters(String str) {
	        Set<Character> distinctChars = new HashSet<>();
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (!Character.isWhitespace(c)) { // Exclude whitespace characters
	                distinctChars.add(c);
	            }
	        }
	        return distinctChars;
	    }
	}


