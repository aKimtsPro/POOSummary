package akimt.bstorm.abstractDemo;

public class Flute extends Instrument{
    private String type;

    public Flute(float prix, String type) {
        super(prix);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void jouer() {
        System.out.println("Joue de la flute.");
    }
}

