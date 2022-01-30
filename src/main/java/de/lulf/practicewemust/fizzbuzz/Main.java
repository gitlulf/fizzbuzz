package de.lulf.practicewemust.fizzbuzz;

import java.util.Objects;

public class Main {
    
    public static void main(String[] args) {

        Objects.requireNonNull(args);
        if (args.length != 2) {
            System.out.println("Bitte 2 Argumente!");
        }
        int from = Integer.valueOf(args[0]);
        int to = Integer.valueOf(args[1]);
        FizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(from, to); 
        
    }
}
