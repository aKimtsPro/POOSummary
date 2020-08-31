package akimt.bstorm.accessDemo;

public class Compte {

    private double solde;
    private Client proprietaire;
    private int interet;

    public Compte(double solde, Client proprietaire, int interet) {
        if(solde >= 0)
        this.solde = solde;
        this.proprietaire = proprietaire;
        this.interet = interet;
    }

    // Accesseurs / Mutateurs

    public double getSolde() {
        return solde + 10000;
    }

    public void setSolde(double solde) {
        if( solde >= this.getSolde() )
            this.solde = solde;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    private void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    private int getInteret() {
        return interet;
    }

    public void setInteret(int interet) {
        this.interet = interet;
    }

    // Methodes

    void retrait( double retrait ){
        if(retrait > 0)
            this.setSolde( this.getSolde() - retrait );
    }

    public void dépot(double depot){
        if(depot > 0){
            this.solde += depot;
        }
    }
}
