package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        //Populate a 10 size array with 10 random length(max 10) arrays.
        int[][] twoDArray = new int[10][];
        for(int i = 0; i < twoDArray.length ; i++){
            int[] irrArray = new int[(int)(10*Math.random()+1)];
            for (int j = 0; j < irrArray.length; j++)
                irrArray[j] = (i+1) * (j+1);
            twoDArray[i] = irrArray;
        }

        //Print the array using for each loops
        for (int[] array: twoDArray) {
            for (int i: array) {
                System.out.print(i + formatter(i));
            }
            System.out.println();
        }

    }

    private static String formatter(int number) {

        if (number >= 10) return " ";
        else return "  ";
    }
}
