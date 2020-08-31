package akimt.bstorm.exo3;

public class Humain {

    private String nom;
    private String adresse;

    // Constructor(s)

    public Humain(String nom, String adresse) {
        setNom( nom );
        this.adresse = adresse;
    }

    // Getter/Setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {

        if(nom.length() > 6)
            nom = nom.substring(0,5);

        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Methods

    public void saluer(){
        System.out.println("Bonjour je suis " + getNom());
    }

    public void saluer(int repeat){
        for(int i = 0 ; i< repeat; i++){
            saluer();
        }
    }

    public void saluer(String message){
        saluer();
        System.out.println(message);
    }

    public void saluer(int repeat, String message){
        saluer();
        for(int i = 0; i < repeat; i++)
            System.out.println(message);
    }

    public void saluer(String message, int repeat){
        for(int i = 0; i < repeat ; i++)
        {
            saluer(message);
        }
    }
}
