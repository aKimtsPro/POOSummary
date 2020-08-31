package akimt.bstorm.exo2;

public class Personne {

    private String nom;
    private String adresse;
    private final String dateNaiss;
    private Chien chien;

    public Personne(String nom, String adresse, String dateNaiss) {
        this.setNom(nom);
        this.setAdresse(adresse);

        if(!dateNaiss.isEmpty())
            this.dateNaiss = dateNaiss;
        else
            this.dateNaiss = "01-01-0001";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom.length() >= 6)
            this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        if(adresse != null && adresse.length() != 0 )
            this.adresse = adresse;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public Chien getChien() {
        return chien;
    }

    public void setChien(Chien chien) {
        if( chien.getNom().length() < 8 && chien.getRace() != "shiba" )
            this.chien = chien;
    }
}
