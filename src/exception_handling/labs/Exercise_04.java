package exception_handling.labs;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04{

    public static void main(String[] args) {

        try {
            //Create 10 slot array
            int[] array = new int[10];
            //Create a for loop that will throw an ArrayIndexOutOfBoundsException
            for (int i = 0 ; i < 11 ; i++){
                array[i] = i;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception - Array index out of bounds");
            System.out.println("Trying to read log file for more details");
            try {

            String file = "nonExistentLogFile.txt";
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(file);
            } catch(FileNotFoundException exc) {
                System.out.println("Exception - Log file not found");
            }
        }


    }
}
