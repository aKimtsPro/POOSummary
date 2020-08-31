package akimt.bstorm.heritageDemo;

public class Sandwich extends Aliment {

    public float taille;

    public Sandwich(String type, float prix, String nom, float taille) {
        super(type, prix, nom);
        this.taille = taille;
    }

    @Override
    public void seFaireManger() {
        System.out.println( this.type + " se fait manger avec les doigts");
    }
}
