package akimt.bstorm.exo7;

public abstract class Instrument {

    private String marque;
    private String modele;
    private float prix;

    public Instrument(String marque, String modele, float prix) {
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public abstract void faireDuBruit();
}
