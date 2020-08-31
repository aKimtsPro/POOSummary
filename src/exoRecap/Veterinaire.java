package exoRecap;

import java.util.ArrayList;
import java.util.List;

public class Veterinaire<T extends Animal> {

    private List<Intervention> interventionListe;
    private List<T> respAnimal;
    private String nom;

    public Veterinaire( String nom ) {
        this.interventionListe = new ArrayList<>();
        this.respAnimal = new ArrayList<>();
        this.nom = nom;
    }


    public Intervention soigner(T aSoigner) {

        if (aSoigner.getEtat() != Etat.SANTE && this.getRespAnimal().contains(aSoigner)) {
            System.out.println(this.nom + " soigne l'animal " + aSoigner.getNom());
            Intervention intervention = new Intervention(this.getNom(), aSoigner);
            this.interventionListe.add(intervention);
            aSoigner.setEtat(Etat.SANTE);

            return intervention;

        } else if (aSoigner.getEtat() == Etat.SANTE) {
            System.out.println("L'animal est déjà en bonne santé");
            return null;
        } else {
            System.out.println("L'animal ne laisse pas soigner");
            return null;
        }
    }

    public void afficherIntervention(){

        for(int i = 0; i < this.interventionListe.size() ; i++){
            System.out.println( this.interventionListe.get(i) + "\n");
        }
    }

    public List<Intervention> getInterventionListe() {
        return interventionListe;
    }

    public void setInterventionListe(List<Intervention> interventionListe) {
        this.interventionListe = interventionListe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<T> getRespAnimal() {
        return respAnimal;
    }

    public void setRespAnimal(List<T> respAnimal) {
        this.respAnimal = respAnimal;
    }
}
