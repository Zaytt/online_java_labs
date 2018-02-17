package inheritance.labs;

/**
 * The M416 is the most popular Assault Rifle given that it is the most customizable.
 */

import java.awt.*;

public class M416 extends AssaultRifle{

    private Image skin;
    private Model model = new Model("M16");

    public M416(){
        super(11.00,12.00, (short)900);
        this.setBase_dmg(41);
        this.setAmmoType("5.56");
        this.setBulletCount((byte)0);
        this.setGripAttachment('n');
        this.setMagazineType('d');
        this.setMuzzleAttachment('n');
        this.setName("M416 Assault Rifle");
        this.setSights('n');
        this.setStockAttachment('n');
        this.setWeight(4.00);
    }


    public void fire(){
        if(this.getBulletCount() > 0) {
            System.out.println("Bang! ");
            super.fire();
        }
        else {
            System.out.println(" <- Out of Bullets!! ->");
            this.reload();
        }

    }

    public void fire(int bullets){
        for(int i = 0; this.getBulletCount() > 0 && i < bullets ; i++)
            fire();
    }


    public void sprayMag(){
        for(int i = this.getBulletCount() ; i >= 0 ; i++){
            fire();
        }

    }

    public void reload(){
        System.out.println("Reloading weapon...");
        super.resetMagazine();
    }

    public Image getSkin() {
        return skin;
    }

    public void setSkin(Image skin) {
        this.skin = skin;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        String string = "   Weapon: " + this.getName() + "\n" +
                        "   Ammo type: " + this.getAmmoType() + "\n" +
                        "   Bullet speed " + this.getBulletSpeed() + " m/s" + "\n" +
                        "   Bullets in Magazine: " + this.getBulletCount() + "\n" +
                        "   Attachements: \n" +
                            "       Muzzle:         " + this.muzzleAttachmentToString(this.getMuzzleAttachment()) + "\n" +
                            "       Grip:           " + this.gripAttachmentToString(this.getGripAttachment()) + "\n" +
                            "       Magazine Type:  " + this.magazineToString(this.getMagazineType()) + "\n" +
                            "       Stock           " + this.stockToString(this.getStockAttachment()) + "\n" +
                            "       Sights          " + this.sightsToString(this.getSights());

        return string;
    }
}
