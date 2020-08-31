package akimt.bstorm.exceptionExo;

public class Livre {

    private String nom;
    private int nbrPage;
    private Genre genre;

    public Livre(String nom, int nbrPage, Genre genre) {
        this.setNom(nom);
        this.setNbrPage(nbrPage);
        this.setGenre(genre);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrPage() {
        return nbrPage;
    }

    public void setNbrPage(int nbrPage) {
        this.nbrPage = nbrPage;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
