package packages_interfaces.labs;

import java.awt.*;

/**
 * Basic infantry unit.
 */
public class Soldier implements Unit{
    int attkPower = 10;
    int hitpoints = 100;
    int speed = 9;
    int armor = 4;
    int attkRange = 30;
    boolean moving;
    String name = "Soldier";
    Point position;

    @Override
    public boolean move(Point coord) {
        //Perform soldier's moving animation
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
        //Perform die animation.
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

    public void attack(Unit target){
        System.out.println("This unit is attacking a " + target.getName());

    }

    @Override
    public void spawn(Point pos) {
        this.setPosition(pos);
    }

    public void setPosition(Point pos){
        this.position = pos;
    }
}
