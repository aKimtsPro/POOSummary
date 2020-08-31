package akimt.bstorm.exo4;

public class Chihuahua extends Chien {

    // Variables membres

    private int decibel;

    // Constructeurs

    public Chihuahua(String nom, String dateNaiss, double taille, int decibel) {
        super(nom, dateNaiss, taille);
        this.decibel = decibel;
    }

    // Get/Set

    public int getDecibel() {
        return decibel;
    }

    public void setDecibel(int decibel) {
        this.decibel = decibel;
    }

    // Methodes

    public void aboyer(String target){
        System.out.println(this.getNom() + " aboie avec une intensité de " +
                this.getDecibel() + "db sur "+ target +".");
    }

    // Overrides

    public void aboyer(){
        System.out.println(this.getNom() + " aboie avec une intensité de " +
                this.getDecibel() + "db.");
    }
}
