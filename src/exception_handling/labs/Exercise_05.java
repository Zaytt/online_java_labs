package exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Exercise_05{

    public static void main(String[] args) throws ArithmeticException {
        try {
           throw new ArithmeticException();
        } catch (Exception e) {
            System.out.println("Exception thrown by the user. Exception was: ");
            e.printStackTrace();
        }

    }

}

