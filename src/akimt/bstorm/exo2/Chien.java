package akimt.bstorm.exo2;

public class Chien {

    private String nom;
    private final String race;

    public Chien(String nom, String race) {
        if(nom.length() <= 8)
            this.nom = nom;
        else
            this.nom = "nom par defaut";

        this.race = race;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(!nom.contains(" "))
            this.nom = nom;
    }

    public String getRace() {
        return race;
    }


}
