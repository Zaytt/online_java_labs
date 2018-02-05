package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.println("Write a number between 1 & 7 to determine its corresponding day of the week.");
        // assign input to variable as int
        int dayNumber = scanner.nextInt();

        // write completed code here
        if(dayNumber < 1 || dayNumber > 7){
            System.out.println("That's not a number between 1 and 7.");
        } else {
            if (dayNumber == 1) {
                System.out.println("The corresponding day is Monday");
            } else if (dayNumber == 2) {
                System.out.println("The corresponding day is Tuesday");
            } else if (dayNumber == 3) {
                System.out.println("The corresponding day is Wednesday");
            } else if (dayNumber == 4) {
                System.out.println("The corresponding day is Thursday");
            } else if (dayNumber == 5) {
                System.out.println("The corresponding day is Friday");
            } else if (dayNumber == 6) {
                System.out.println("The corresponding day is Saturday");
            } else if (dayNumber == 7) {
                System.out.println("The corresponding day is Sunday");
            }
        }


    }
}
