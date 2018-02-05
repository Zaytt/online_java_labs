package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args){
        int i = 100;
        while(i > 0){
            System.out.println(i);
            if(i == 50) break; //Will exit at half of the loop iterations instead of the 100 intended.
            i--;
        }
    }
}
