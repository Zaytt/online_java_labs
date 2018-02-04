package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {


        // write code here
        double radius = 3.14;
        double height = 5;
        double cylinderArea;
        double cylinderPerimeter;

        cylinderPerimeter = (Math.PI * radius * 2);
        cylinderArea = (2*Math.PI * Math.pow(radius, 2))  + (cylinderPerimeter * height);

        System.out.println( "A cylinder with a radius of 3.14 and a height of 5 \n " +
                            "has a perimeter of " + cylinderPerimeter + "\n " +
                            "and an area of " + cylinderArea);

    }
}
