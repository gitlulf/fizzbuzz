package de.lulf.practicewemust.fizzbuzz;

public class ConsoleBasedFizzBuzz implements FizzBuzz {
    
    @Override
    public void print(int from, int to) {
        for (int i = 1; i <= to; i++) {
            System.out.println(compute(i));
        }
    }
    
    protected String compute (int number) {
            String output = "";
            if (number % 3 == 0) {
                output = "Fizz";
            }
            if (number % 5 == 0) {
                output = output + "Buzz";
            }
            if (output.length() == 0) {
                output = String.valueOf(number);
            }
            return output;
    }
    
    // als Versuch
    protected String compute2 (int number) { 
        String output = "";
        if (number == 42){
            output = "Sinn des Lebens.";
        }
        else if (number%7 == 0){
            output = "Bingo";
        }
        else {
            output = String.valueOf(number);
        }
        return output;
    }
}
