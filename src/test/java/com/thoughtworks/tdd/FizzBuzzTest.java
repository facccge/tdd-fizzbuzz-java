package com.thoughtworks.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    @Test
    public void say1Test() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 1;
        String actual = fizzBuzz.fizzBuzz(input);
        assertThat(actual,is(""));
    }

    @Test
    public void say3Test() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 3;
        String actual = fizzBuzz.fizzBuzz(input);
        assertThat(actual, is("Fizz"));
    }

    @Test
    public void say5Test() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 5;
        String actual = fizzBuzz.fizzBuzz(input);
        assertThat(actual, is("Buzz"));
    }

    @Test
    public void say7Test() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 7;
        String actual = fizzBuzz.fizzBuzz(input);
        assertThat(actual, is("Whizz"));
    }
}
