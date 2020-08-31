package akimt.bstorm.exo7;

public class Harpe extends Instrument{

    public Harpe(String marque, String modele, float prix) {
        super(marque, modele, prix);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(" Frululum... ");
    }
}
