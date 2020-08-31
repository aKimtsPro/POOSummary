package akimt.bstorm.enumDemo;

public enum RaceChien {
    LABRADOR(100),
    DALMATIEN(140),
    CHIHUAHUA(80);

    private final float tailleMoyenne;

    private RaceChien(float tailleMoyenne){
        this.tailleMoyenne = tailleMoyenne;
    }

    public float getTailleMoyenne() {
        return tailleMoyenne;
    }
}
