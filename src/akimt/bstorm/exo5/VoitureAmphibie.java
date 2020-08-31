package akimt.bstorm.exo5;

public class VoitureAmphibie extends Voiture implements Navigant {
    private String couleur;

    public VoitureAmphibie(float poid, String modele, String couleur) {
        super(poid, modele);
        this.setCouleur(couleur);
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

//    @Override
//    public void rouler() {
//        System.out.println("La voiture amphibie roule.");
//        this.seDeplacer();
//    }

    @Override
    public void naviger() {
        System.out.println("La voiture amphibie roule.");
        this.seDeplacer();
    }
}
