package conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.nextLine();
        int i = 0;
        while(i < word.length()){
            if( word.charAt(i) == 'a' || word.charAt(i) == 'A' ||
                word.charAt(i) == 'e' || word.charAt(i) == 'E' ||
                word.charAt(i) == 'i' || word.charAt(i) == 'I' ||
                word.charAt(i) == 'o' || word.charAt(i) == 'O' ||
                word.charAt(i) == 'u' || word.charAt(i) == 'U' ) {
                System.out.println("The first vowel in " + word + " is '" + word.charAt(i)+"'");
                break;
            }
            i++;
        }


    }

}
