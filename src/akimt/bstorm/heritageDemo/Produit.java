package akimt.bstorm.heritageDemo;

public class Produit {

    public String nom;
    public float prix;

    public Produit(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void seFaireAcheter(){
        System.out.println( this.nom + " se fait acheter.");
    }
}
