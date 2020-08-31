package akimt.bstorm.exo7.part2;

public class Verre extends Vaisselle {

    private float capacite;

    public Verre(float capacite) {
        this.capacite = capacite;
    }

    public float getCapacite() {
        return capacite;
    }

    public void setCapacite(float capacite) {
        if(capacite > 0)
            this.capacite = capacite;
    }
}
