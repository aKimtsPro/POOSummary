package akimt.bstorm.interfaceDemo;

public class Humain extends Vivant implements Grandissable, Mangeur {

    private String nom;
    private String dateNaiss;
    private float taille;

    public Humain(String nom, String dateNaiss) {
        super(1);
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.taille = 1.75f;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    @Override
    public void grandir() {
        setTaille( getTaille() + 1);
    }

    @Override
    public void manger() {
        System.out.println("L'humain mange");
    }
}
