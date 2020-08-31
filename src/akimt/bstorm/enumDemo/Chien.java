package akimt.bstorm.enumDemo;

public class Chien {

    private String nom;
    private RaceChien race;

    public Chien(String nom, RaceChien race) {
        this.nom = nom;
        this.race = race;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public RaceChien getRace() {
        return race;
    }

    public void setRace(RaceChien race) {
        this.race = race;
    }
}
