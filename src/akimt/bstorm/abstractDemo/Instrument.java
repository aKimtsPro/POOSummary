package akimt.bstorm.abstractDemo;

public abstract class Instrument {

    private float prix;

    public Instrument(float prix) {
        this.setPrix(prix);
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if(prix >= 0)
            this.prix = prix;
    }

    public void jouer(){
        System.out.println("l'instrument est joué");
    }
}
