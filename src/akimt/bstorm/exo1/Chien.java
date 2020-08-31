package akimt.bstorm.exo1;

public class Chien {

    String nom;
    String dateNaiss;
    Personne proprietaire;

    public Chien(String nom, String dateNaiss, Personne proprietaire) {
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.proprietaire = proprietaire;
    }

    void setProprietaire(Personne proprietaire){
        this.proprietaire = proprietaire;
    }

    void changerNomPersonne(Personne personne, String nom){
        personne.nom = nom;
    }

    void aboyer(){
        System.out.println( this.nom + " aboie sur " + proprietaire.nom);
    }
}
