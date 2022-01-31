package de.lulf.practicewemust.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConsoleBasedFizzBuzzTest {

    @org.junit.jupiter.api.Test
    void compute() {
        ConsoleBasedFizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        String result = fizzBuzz.compute(1);
        Assertions.assertEquals("1", result);
        result = fizzBuzz.compute(3);
        Assertions.assertEquals("Fizz", result);
        result = fizzBuzz.compute(5);
        Assertions.assertEquals("Buzz", result);
        result = fizzBuzz.compute(15);
        Assertions.assertEquals("FizzBuzz", result);
        result = fizzBuzz.compute(16);
        Assertions.assertEquals("16", result);
    }
    
    @Test
    void compute2() {
        ConsoleBasedFizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        String result = fizzBuzz.compute2(1);
        Assertions.assertEquals("1", result);
        result = fizzBuzz.compute2(2);
        Assertions.assertEquals("2", result);
        result = fizzBuzz.compute2(57);
        Assertions.assertEquals("57", result);
        result = fizzBuzz.compute2(8);
        Assertions.assertEquals("8", result);
        result = fizzBuzz.compute2(100);
        Assertions.assertEquals("100", result);
        result = fizzBuzz.compute2(7);
        Assertions.assertEquals("Bingo", result);
        result = fizzBuzz.compute2(42);
        Assertions.assertEquals("Sinn des Lebens.", result);
    }
}