package akimt.bstorm.exceptionExo;

public class Auteur {

    private String nom;
    private Genre genreDeRoman;

    public Auteur(String nom, Genre genreDeRoman) {
        this.setNom(nom);
        this.setGenreDeRoman(genreDeRoman);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Genre getGenreDeRoman() {
        return genreDeRoman;
    }

    public void setGenreDeRoman(Genre genreDeRoman) {
        this.genreDeRoman = genreDeRoman;
    }
}
