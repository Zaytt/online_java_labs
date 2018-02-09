package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];
        for(int i = 0, x = 3; i < twoDArray.length; i++, x += 3*(twoDArray[0].length) ){
            for(int j = 0, y = x; j < twoDArray[i].length ; j++, y += 3){
                System.out.print(y + formatter(y));
            }
            System.out.println();
        }
    }

    private static String formatter(int number) {

        if (number >= 10) return " ";
        else return "  ";
    }
}
