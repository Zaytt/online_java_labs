package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */

//5 Classes, 1 for Combat and 4 for Age of Empires 2 inspired units.

class Combat{

    public static void main(String[] args) {

        Archer archer = new Archer();
        Knight knight = new Knight();
        EagleWarrior ewarrior = new EagleWarrior();
        WarElephant warElephant = new WarElephant();

        Combat combat = new Combat();

        System.out.println("Archer vs Knight: " + combat.duel(archer, knight) + " wins.");
        System.out.println("Eagle Warrior vs War Elephant: " + combat.duel(ewarrior, warElephant) + " wins.");


    }

    public String duel(Unit unit1, Unit unit2){
        while(unit1.getHitpoints() > 0 && unit2.getHitpoints() > 0){
            unit1.setHitpoints(unit1.getHitpoints()-(unit2.getAttack() - unit1.getDefense()));
            unit2.setHitpoints(unit2.getHitpoints()-(unit1.getAttack() - unit2.getDefense()));
        }

        if(unit1.getHitpoints() > 0) return unit1.getName();
        else                    return unit2.getName();
    }


}

class Unit{
    private String name;
    private int hitpoints;
    private int attack;
    private int defense;
    private double speed;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

class EagleWarrior extends Unit{

    public EagleWarrior() {
        this.setName("Eagle Warrior");
        this.setHitpoints(30);
        this.setAttack(7);
        this.setDefense(2);
        this.setSpeed(9);
        this.setCost(10);
    }

    //Special ability
    public void sprint() {
        this.setSpeed(this.getSpeed()*1.5);
        System.out.println("Eagle Warrior increases his speed to " + this.getSpeed() * 1.5 + " for 15 seconds");
    }
}

class Knight extends Unit{

    public Knight() {
        this.setName("Knight");
        this.setHitpoints(50);
        this.setAttack(9);
        this.setDefense(4);
        this.setSpeed(6);
        this.setCost(16);
    }

    //Special ability
    public void raiseShield() {
        this.setDefense(this.getDefense()+10);
        this.setAttack(this.getAttack()-5);
        System.out.println("Knight increases his defense to " + (this.getDefense() + 10) +
                " and decreases his attack to " + (this.getDefense() - 5));
    }
}

class Archer extends Unit{

    public Archer() {
        this.setName("Archer");
        this.setHitpoints(25);
        this.setAttack(8);
        this.setDefense(1);
        this.setSpeed(7);
        this.setCost(12);
    }

    //Special ability
    public void longShot(){
        System.out.println("Archer deals " + this.getAttack()*2 + " to enemy unit");
    }
}

class WarElephant extends Unit{

    public WarElephant() {
        this.setName("War Elephant");
        this.setHitpoints(200);
        this.setAttack(15);
        this.setDefense(3);
        this.setSpeed(5);
        this.setCost(50);
    }

    //Special ability
    public void stomp(){
        System.out.println("War elephant deals 2 damage to all nearby units");
    }
}

