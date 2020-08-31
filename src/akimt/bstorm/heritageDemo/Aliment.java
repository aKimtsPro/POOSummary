package akimt.bstorm.heritageDemo;

public class Aliment extends Produit {

    public String type;
    public static String test;

    public Aliment(String type, float prix, String nom) {
        super(nom, prix);
        this.type = type;
    }

    public void seFaireManger(){
        System.out.println( this.type + " se fait manger");
    }
}
