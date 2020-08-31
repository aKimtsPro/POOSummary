package akimt.bstorm.interfaceDemo;

public class Arbre extends Vivant implements Grandissable {
    private String type;
    private float hauteur;

    public Arbre(String type, float hauteur) {
        super(1);
        this.type = type;
        this.hauteur = hauteur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public void grandir(){
        setHauteur( getHauteur() + 10 );
    }

    @Override
    public float getTaille() {
        return getHauteur();
    }

    @Override
    public void setTaille(float taille) {
        this.setHauteur(taille);
    }
}
