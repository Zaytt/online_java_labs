package inheritance.labs;


/**
 * The Assault Rifles are the weapons that are the most customizable
 * Each Assault Rifle shares multiple attributes like recoil parameters, bullet speed, ammo types and the attachments.
 */
public class AssaultRifle extends Weapon{

    private double  vRecoil, hRecoil;
    private short   bulletSpeed;
    private byte    bulletCount;
    private String  ammoType;
    private char    muzzleAttachment, gripAttachment, magazineType, stockAttachment, sights;


    public AssaultRifle(double vRecoil, double hRecoil, short bulletSpeed) {
        this.vRecoil = vRecoil;
        this.hRecoil = hRecoil;
        this.bulletSpeed = bulletSpeed;
    }

    public void fire(){
        this.bulletCount --;
    }

    public void resetMagazine(){

        if(magazineType == 'e' || magazineType =='x')
            this.bulletCount = 40;
        else
            this.bulletCount = 30;
    }


    public String getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    public double getvRecoil() {
        return vRecoil;
    }

    public void setvRecoil(double vRecoil) {
        this.vRecoil = vRecoil;
    }

    public double gethRecoil() {
        return hRecoil;
    }

    public void sethRecoil(double hRecoil) {
        this.hRecoil = hRecoil;
    }

    public short getBulletSpeed() {
        return bulletSpeed;
    }

    public void setBulletSpeed(short bulletSpeed) {
        this.bulletSpeed = bulletSpeed;
    }

    public byte getBulletCount() {
        return bulletCount;
    }

    public void setBulletCount(byte bulletCount) {
        this.bulletCount = bulletCount;
    }

    public char getMuzzleAttachment() {
        return muzzleAttachment;
    }

    public void setMuzzleAttachment(char muzzleAttachment) {
        this.muzzleAttachment = muzzleAttachment;
    }

    public char getGripAttachment() {
        return gripAttachment;
    }

    public void setGripAttachment(char gripAttachment) {
        this.gripAttachment = gripAttachment;
    }

    public char getMagazineType() {
        return magazineType;
    }

    public void setMagazineType(char magazineType) {
        this.magazineType = magazineType;
    }

    public char getStockAttachment() {
        return stockAttachment;
    }

    public void setStockAttachment(char stockAttachment) {
        this.stockAttachment = stockAttachment;
    }

    public char getSights() {
        return sights;
    }

    public void setSights(char sights) {
        this.sights = sights;
    }

    public String muzzleAttachmentToString(char muzzleCode){
        String muzzle;
        switch(muzzleCode){
            case 'n': muzzle = "No muzzle attachment";
                break;
            case 'c': muzzle = "Compensator";
                break;
            case 'f': muzzle = "Flash Hider";
                break;
            case 's': muzzle = "Silencer";
                break;
            default : muzzle = "No muzzle attachment";
        }

        return muzzle;
    }

    public String gripAttachmentToString(char gripCode){
        String grip;
        switch(gripCode){
            case 'n': grip = "No grip attached";
                    break;
            case 'v': grip = "Vertical grip";
                    break;
            case 'h': grip = "Horizontal grip";
                    break;
            default : grip = "No grip attached";
        }
        return grip;
    }

    public String magazineToString(char magCode){
        String magazine;
        switch(magCode){
            case 'e': magazine = "Extended magazine";
                    break;
            case 'q': magazine = "Quick draw magazine";
                    break;
            case 'x': magazine = "Extended quick draw magazine";
                    break;
            case 'd':
            default : magazine = "Default magazine";
        }
        return magazine;
    }

    public String stockToString(char stockCode){
        String stock;
        switch(stockCode){
            case 'b': stock = "Bullet Loop";
                    break;
            case 't': stock = "Tactical Stock";
                    break;
            case 'p': stock = "Cheek Pad";
                    break;
            case 'n':
            default : stock = "Default stock";
        }
        return stock;
    }

    public String sightsToString(char sightCode){
        String sights;
        switch(sightCode){
            case 'r': sights = "Red dot sight";
                    break;
            case 'h': sights = "Holographic sight";
                break;
            case '2': sights = "2x Scope";
                break;
            case '4': sights = "4x ACOG Scope";
                break;
            case '8': sights = "8x Scope";
                break;
            default : sights = "Iron sights - No Sights are attached";
        }
        return sights;
    }


}
