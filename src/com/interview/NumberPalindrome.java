package com.interview;

public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 363;
        System.out.println(isPalindrome(number) ? "Palindrome" : "Not Palindrome");
    }
    

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10; //3//6//0
            reversedNumber = reversedNumber * 10 + digit;//3//36//
            number = number /10;//36//3
        }

        return originalNumber == reversedNumber;
    }
}
