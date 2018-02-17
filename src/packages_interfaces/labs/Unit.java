package packages_interfaces.labs;

import java.awt.*;

public interface Unit {

    boolean move(Point coord); //Returns true when arrives to destination, false if unable to move.
    boolean moving(); //Returns true if unit is moving. When a unit is moving it cannot perform other actions.
    default void die(){
        System.out.println("A " + this.getName() + " has died.");
    }
    Point getPos();
    String getName();
    void spawn(Point pos);

}
