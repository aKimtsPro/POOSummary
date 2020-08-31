package akimt.bstorm.genericiteDemo;

public class Biscuit implements Pesable{

    private float poid;
    private String marque;

    public Biscuit(float poid, String marque) {
        this.poid = poid;
        this.marque = marque;
    }

    @Override
    public float getPoid() {
        return poid;
    }

    @Override
    public void setPoid(float poid) {
        this.poid = poid;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
