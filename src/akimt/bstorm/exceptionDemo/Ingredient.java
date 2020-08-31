package akimt.bstorm.exceptionDemo;

public class Ingredient {

    private String nom;
    private int qtt;

    public Ingredient(String nom, int qtt) {
        this.nom = nom;
        this.qtt = qtt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQtt() {
        return qtt;
    }

    public void setQtt(int qtt) {
        this.qtt = qtt;
    }
}
