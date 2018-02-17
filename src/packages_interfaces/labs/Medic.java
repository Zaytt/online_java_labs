package packages_interfaces.labs;

import java.awt.*;

/**
 * Infantry unit that heals friendly units. Deals little damage and is more vulnerable than other infantry.
 */

public class Medic implements Unit{
    int attkPower = 2;
    int hitpoints = 60;
    int speed = 7;
    int armor = 2;
    boolean moving;
    String name = "Medic";
    Point position;

    public boolean move(Point coord) {
        //Perform medics's moving animation
        if(getPos() == coord ){
            return true;
        } else {
            //Keep moving
            return false;
        }
    }

    @Override
    public boolean moving() {
        return moving;
    }

    @Override
    public void die() {
        //Perform Medic's death animation.
        //Game.Population--;
        System.out.println("A " + this.getName() + " has died.");
    }

    @Override
    public Point getPos() {
        return position;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String heal(Unit target){
        return "This unit is healing " + target.getName();
    }

    @Override
    public void spawn(Point pos) {
        this.setPosition(pos);
    }

    public void setPosition(Point pos){
        this.position = pos;
    }
}
