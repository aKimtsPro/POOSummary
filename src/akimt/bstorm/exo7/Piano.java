package akimt.bstorm.exo7;

public class Piano extends Instrument {

    public Piano(String marque, String modele, float prix) {
        super(marque, modele, prix);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(" *bruit de piano*... ");
    }
}
