package akimt.bstorm.exo4;

public class Dalmatien extends Chien {

    private final String NOM_RACE = "dalmation";
    private int nbrPoint = 10;

    public Dalmatien(String nom, String dateNaiss, double taille) {
        super(nom, dateNaiss, taille);
        this.setRace(NOM_RACE);
    }

    public Dalmatien(String nom, String dateNaiss, double taille, int nbrPoint) {
        super(nom, dateNaiss, taille);
        this.nbrPoint = nbrPoint;
        this.setRace(NOM_RACE);
    }

    public Dalmatien(String nom, double taille){
        super(nom, "01-01-0001", taille);
        this.setRace(NOM_RACE);
    }

    public int getNbrPoint() {
        return nbrPoint;
    }

    public void setNbrPoint(int nbrPoint) {
        if(nbrPoint >= 0)
            this.nbrPoint = nbrPoint;
    }
}
