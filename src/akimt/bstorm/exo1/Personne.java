package akimt.bstorm.exo1;

public class Personne {

    public String nom;
    public String dateNaiss;

    public Personne(String nom, String dateNaiss) {
        this.nom = nom;
        this.dateNaiss = dateNaiss;
    }

    public void saluer(){
        System.out.println("Bonjour, je m'appelle " + this.nom);
    }

    void caresser( Chien chien ){
        System.out.println(this.nom + " caresse " + chien.nom);
    }
}
