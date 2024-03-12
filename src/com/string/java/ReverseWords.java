package com.string.java;

public class ReverseWords {
    public static String reverseWords(String input) {
        // Split the input string into words
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        // Iterate through each word and reverse it
        for (String word : words) {
            // Reverse the word and append it to the result
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversed.append(reversedWord).append(" ");
        }

        // Remove the trailing space and return the result
        return reversed.toString().trim();
        
    }

    public static void main(String[] args) {
        String input = "arvind kumar";
        String output = reverseWords(input);
        System.out.println(output); // Output: dnivra ramuk
    }
}
