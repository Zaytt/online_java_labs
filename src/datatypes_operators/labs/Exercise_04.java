package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04{

    public static void main(String[] args) {
        double[] array = new double[10];
        double sum = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i = 1; i < 11; i++){
            System.out.println("Enter number #" + i);
            array[i-1] = scanner.nextDouble();
        }

        for (double i: array) { sum += i; }
        avg = sum/10;

        System.out.println("The sum of those numbers is " + sum + " and their average is " + avg);


    }

}