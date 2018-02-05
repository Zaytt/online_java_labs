package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main(String[] args){
        int i = 1000;
        int counter = 0;

        while(i > 0) {
            counter++;
            if(counter == 3){
                System.out.println(i);
                counter = 0;
            }
            i--;
        }
    }
}
