package com.thoughtworks.tdd;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        int[] spicialNumbers = {3,5,7};
        String result = "";
        if (number % spicialNumbers[0] == 0) {
            result += "Fizz";
        }
        if (number % spicialNumbers[1] == 0) {
            result += "Buzz";
        }
        if (number % spicialNumbers[2] == 0) {
            result += "Whizz";
        }
        return result;
    }
}
