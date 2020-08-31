package akimt.bstorm.exo5;

public class Bateau extends Vehicule implements Navigant {

    private int puissanceMoteur;

    public Bateau(float poid, int puissanceMoteur) {
        super(poid);
        this.setPuissanceMoteur(puissanceMoteur);
    }

    public int getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public void setPuissanceMoteur(int puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }

    @Override
    public void seDeplacer() {
        System.out.println("le bateau se deplace.");
    }

    @Override
    public void naviger() {
        System.out.println("Le bateau navigue.");
        this.seDeplacer();
    }
}
