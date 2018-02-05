package conditions_loops.labs;

import java.io.IOException;
import java.util.Scanner;


/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) throws IOException {
        char ignore;
        int number1, number2;
        int sum = 0;
        double average;

        System.out.println("Insert two numbers to calculate the sum of the values in between them and their average:");
        System.out.println("Number 1:");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();

        System.out.println("Number 2:");
        number2 = scanner.nextInt();

        if(number1 > number2) {
            int temp = number2;
            number2 = number1;
            number1 = temp;
        }

        for (int i = number1; i <= number2; i++) sum += i;
        average = (double)sum/((number2-number1+1));
        System.out.println( "The sum of the numbers between " + number1 + " and " +
                            number2 + " is " + sum + " and their average is " + average);



    }
}
