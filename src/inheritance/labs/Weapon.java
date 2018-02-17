package inheritance.labs;

/**
 * Theres plenty of weapons in the game of PUBG.
 * Some are melee weapons others are firearms as well as crossbows.
 */
public class Weapon {

    private String name;
    private double weight;
    private int base_dmg;

    public Weapon() {
    }

    public Weapon(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Weapon(String name, double weight, int base_dmg) {
        this.name = name;
        this.weight = weight;
        this.base_dmg = base_dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBase_dmg() {
        return base_dmg;
    }

    public void setBase_dmg(int base_dmg) {
        this.base_dmg = base_dmg;
    }
}
