package exception_handling.labs;
import packages_interfaces.labs.*;

import java.awt.*;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */


public class Exercise_07{

    public static void main(String[] args) throws UnitOutOfPositionException {
        Point pos = new Point(-1, -1);
        Unit soldier = new Soldier();


        try{
            soldier.spawn(pos);
            if(soldier.getPos().x < 0|| soldier.getPos().y < 0)
                throw new UnitOutOfPositionException(soldier);

        } catch (UnitOutOfPositionException ex) {
            System.out.println(ex);
        }


    }

}

class UnitOutOfPositionException extends Exception{
    Unit unit;

    UnitOutOfPositionException(Unit unit){
        this.unit = unit;
    }

    public String toString() {
        return "Unit: " + this.unit.getName() + " is out of position. \nInvalid position: "
                + unit.getPos().x + "," + unit.getPos().y;
    }

}