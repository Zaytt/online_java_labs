package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args){
        String[] todoList = {"Check passport", "Buy plane tickets", "Find acommodation", "Do the homework", "Finish online course"};
        System.out.println("To do list before my trip to Bali:");
        for (int i = 0; i < todoList.length ; i++) {
            if(i == 3) continue;
            System.out.println(todoList[i]);
        }
    }
}
