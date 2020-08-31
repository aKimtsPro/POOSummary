package akimt.bstorm.abstractDemo;

public class Guitare extends Instrument{

    private int nbrCorde;
    private String constructeur;

    public Guitare(float prix, int nbrCorde, String constructeur) {
        super(prix);
        this.nbrCorde = nbrCorde;
        this.constructeur = constructeur;
    }

    public int getNbrCorde() {
        return nbrCorde;
    }

    public void setNbrCorde(int nbrCorde) {
        this.nbrCorde = nbrCorde;
    }

    public String getConstructeur() {
        return constructeur;
    }

    public void setConstructeur(String constructeur) {
        this.constructeur = constructeur;
    }

    @Override
    public void jouer() {
        System.out.println("Joue de la guitare.");
    }
}
