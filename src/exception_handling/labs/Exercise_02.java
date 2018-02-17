package exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

import java.io.*;

public class Exercise_02{

    public static void main(String[] args) {

        try {
            //Create 10 slot array
            int[] array = new int[10];
            //Create a for loop that will throw an ArrayIndexOutOfBoundsException
            for (int i = 0 ; i < 10 ; i++){
                array[i] = i;
            }

            //Read a non existent file to generate a FileNotFoundException
            String file = "nonExistentFile.txt";
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(file);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught - Array index out of bounds");
        } catch(FileNotFoundException e){
            System.out.println("Exception caught - File not found");
        }


    }
}
