package com.string.java;

public class ClockwiseRotation {
    public static String rotateClockwise(String str, int steps) {
        // Calculate effective rotation steps
        int effectiveSteps = steps % str.length();
        // Rotate the string clockwise
        String rotatedString = str.substring(str.length() - effectiveSteps) + str.substring(0, str.length() - effectiveSteps);
        return rotatedString;
    }

    public static void main(String[] args) {
        String originalString = "Arvindkumar";
        int steps = 2; // Number of steps to rotate clockwise
        String rotatedString = rotateClockwise(originalString, steps);
        System.out.println("Original string: " + originalString);
        System.out.println("Rotated string (clockwise): " + rotatedString);
    }
}

