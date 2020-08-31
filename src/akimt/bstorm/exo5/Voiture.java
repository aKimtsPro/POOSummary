package akimt.bstorm.exo5;

public class Voiture extends Vehicule implements Roulant {

    private String modele;

    public Voiture(float poid, String modele) {
        super(poid);
        this.setModele(modele);
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    @Override
    public void seDeplacer() {
        System.out.println("La voiture se déplace.");
    }

    @Override
    public void rouler() {
        System.out.println("La voiture roule.");
        this.seDeplacer();
    }
}
