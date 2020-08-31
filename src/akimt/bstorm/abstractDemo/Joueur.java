package akimt.bstorm.abstractDemo;

public class Joueur {
    private String nom;
    private final int experience;

    public Joueur(String nom, int experience) {
        this.nom = nom;
        this.experience = experience;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getExperience() {
        return experience;
    }

    public void jouer(Instrument toPlay){
        toPlay.jouer();
    }

}
