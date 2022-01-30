package de.lulf.practicewemust.fizzbuzz;

public class ConsoleBasedFizzBuzz implements FizzBuzz {
    
    @Override
    public void print(int from, int to) {
        for (int i = 1; i <= to; i++) {
            System.out.println(compute(i));
        }
    }
    
    public String compute (int number) {
            String output = "";
            if (number % 3 == 0) {
                output = "Fizz";
            }
            if (number % 5 == 0) {
                output = output + "Buzz";
            }
            if (output == null || output.length() == 0) {
                output = String.valueOf(number);
            }
            return output;
    }
}
