package akimt.bstorm.exo4;

public class Chien {

    // Variables membres

    private String nom;
    private String dateNaiss;
    private double taille;
    private String race;

    // Constructeurs

    public Chien(String nom, String dateNaiss, double taille) {
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.taille = taille;
        this.race = "unknown";
    }

    // Accesseur/mutateur

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

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    // Methodes

    public void aboyer(){
        System.out.println(this.nom + " aboie.");
    }
}