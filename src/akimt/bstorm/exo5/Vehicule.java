package akimt.bstorm.exo5;

public abstract class Vehicule {
    private float poid;

    public Vehicule(float poid) {
        this.setPoid(poid);
    }

    public float getPoid() {
        return poid;
    }

    public void setPoid(float poid) {
        this.poid = poid;
    }

    public abstract void seDeplacer();
}
