package inheritance.labs;

/**
 * Inheritance Example based on the popular videogame PUBG weapon system.
 * You can pick up a weapon and customize it according to your tactical needs.
 */
public class WeaponController {

    public static void main(String[] args) {
        M416 m4 = new M416();

        System.out.println("You just landed from your parachute and begin your search for a weapon.");
        System.out.println("You enter your first building and, lucky you, you find a weapon & some ammo");
        System.out.println("You take it and inspect it:");
        System.out.println(m4.toString());
        System.out.println("After some more looting you have found some extra attachments for your weapon.");
        m4.setGripAttachment('v');
        m4.setMuzzleAttachment('s');
        m4.setSights('4');
        m4.setStockAttachment('t');
        m4.setMagazineType('e');
        m4.setBulletCount((byte)10);
        System.out.println("It now looks like this:");
        System.out.println(m4.toString());
        System.out.println("It's time to look for nearby enemies and it doesn't take you long to find one!");
        m4.fire();
        m4.fire();
        System.out.println("You fire a couple of shots but it's not enough... you press the trigger even more");
        m4.fire(11);
        System.out.println("You did it! Killed your first enemy, but keep looking! There will be more looking for you!");
        System.out.println("Good Luck!!");

    }
}
