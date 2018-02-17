package packages_interfaces.labs;

import java.awt.*;

/**
 * Marines are a stronger, more specialized and costlier form of soldier.
 *
 */

public class Marine extends Soldier {

    int hitpoints = 120; //Marines have more hitpoints
    int attack = 12; //Deal higher damage
    String name = "Marine";

    @Override
    public void spawn(Point pos) {
        this.setPosition(pos);
    }

    public void setPosition(Point pos){
        this.position = pos;
    }

    @Override
    public boolean move(Point coord) {
        return super.move(coord);
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public void die() {
        //Perform Marine's death animation
        System.out.println("A " + this.getName() + " has died.");
    }

    //Increase Marine's speed 33% for 5 secs
    public void Sprint(){

        speed += 3;
        //movingAnimation = sprint;
        //After 5 secs
        speed -= 3;
        //movingAnimation = jog;
    }

    //The Marine uses hits
    public void UseGrenadeLauncher(Point coord){
        if(getPos().distance(coord) < (attkRange/2) ){
            //Use grenade launcher
        } else {
            System.out.println("Unable to use the grenade launcher, target out of range");
        }
    }
}
