public class Weapon {
    private String wepName;
    private int wepMinDamage;
    private int wepMaxDamage;
    private int wepAccuracy;
    // to fill weapons list
    public Weapon(String wepName, int wepMinDamage, int wepMaxDamage, int wepAccuracy) {
        this.wepName = wepName;
        this.wepMinDamage = wepMinDamage;
        this.wepMaxDamage = wepMaxDamage;
        this.wepAccuracy = wepAccuracy;
    }

    public String getWepName() {
        return wepName;
    }
    public int getWepMinDamage() {
        return wepMinDamage;
    }
    public int getWepMaxDamage() {
        return wepMaxDamage;
    }
    public int getWepAccuracy() {
        return wepAccuracy;
    }
}