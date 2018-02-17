package exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01{

    public static void main(String[] args) {

        try {
            //Create 10 slot array
            int[] array = new int[10];
            //Create a for loop that will throw an ArrayIndexOutOfBoundsException
            for (int i = 0 ; i < 11 ; i++){
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception catched, the program executes without crashing.");
        }

    }
}