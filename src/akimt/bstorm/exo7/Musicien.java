package akimt.bstorm.exo7;

import java.util.ArrayList;
import java.util.List;

public class Musicien<T extends Instrument> {

    private float solde;
    private String nom;
    private List<T> instruPossede;

    public Musicien(float solde, String nom) {
        this.solde = solde;
        this.nom = nom;
        this.instruPossede = new ArrayList<>();
    }

    public Musicien(float solde, String nom, List<T> instruPossede) {


        this.solde = solde;
        this.nom = nom;
        this.instruPossede = instruPossede;
    }

    public void acheter( T instru ){

        if( getSolde() >= instru.getPrix() )
        {
            setSolde( getSolde() - instru.getPrix() );

            this.instruPossede.add( instru );

            System.out.println(this.nom + " a ajouté un instrument ("
                    + instru.getMarque() +" "+ instru.getModele() + ")");
        }
        else{
            System.out.println( nom + " n'a pas assez d'argent pour s'acheter l'instrument. ");
        }
    }

    public void jouer( T instrument ){
        if( getInstruPossede().contains(instrument) )
        {
            System.out.println( getNom() + " joue d'un instrument("
                    + instrument.getMarque()+" "+ instrument.getModele() +")");
            instrument.faireDuBruit();
        }
        else{
            System.out.println("Cette instrument ne fait pas partie de sa collection.");
        }
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        if(solde >= 0)
            this.solde = solde;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if( !nom.isBlank() )
            this.nom = nom;
    }

    public List<T> getInstruPossede() {
        return instruPossede;
    }

    public void setInstruPossede(List<T> instruPossede) {
        this.instruPossede = instruPossede;
    }
}
