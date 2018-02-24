package generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an array and prints out the value at a certain index.
 */

class Exercise_02{
    public static void main(String[] args) {

        Integer arrayInt[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String arrayString[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        System.out.println("In the Integer array, the element at the 5th index is: " + valueAt(arrayInt, 5));
        System.out.println("In the String array, the element at the 3rd index is: " + valueAt(arrayInt, 3));
    }

    static <T> T valueAt(T[] array, int index){
        if(index > -1 && index < array.length){
            return array[index];
        } else {
            System.out.println("Index not valid.");
            return null;
        }
    }


}
