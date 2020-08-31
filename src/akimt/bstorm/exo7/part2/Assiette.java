package akimt.bstorm.exo7.part2;

public class Assiette extends Vaisselle {

    private String forme;
    private float diametre;

    public Assiette(String forme, float diametre) {
        this.forme = forme;
        this.diametre = diametre;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public float getDiametre() {
        return diametre;
    }

    public void setDiametre(float diametre) {
        if(diametre > 0)
            this.diametre = diametre;
    }
}
