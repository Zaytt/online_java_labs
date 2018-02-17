package exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_06{

    public static void main(String[] args) {

        exampleClass example = new exampleClass();

        try {
            example.exGenerator();
        } catch (Exception e) {
            System.out.println("Exception caught by the main method. Exception was: ");
            e.printStackTrace();
        }

    }


}

class exampleClass{

    public void exGenerator(){
        try {
            //Create 10 slot array
            int[] array = new int[10];
            //Create a for loop that will throw an ArrayIndexOutOfBoundsException
            for (int i = 0 ; i < 11 ; i++){
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught, now rethrowing the Ex to the main method. ");
            throw ex;
        }
    }
}