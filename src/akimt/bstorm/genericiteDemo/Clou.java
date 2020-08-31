package akimt.bstorm.genericiteDemo;

public class Clou implements Pesable{

    private String type;
    private static float poid = 2;

    public Clou(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setPoid(float param) {
        poid = param;
    }

    @Override
    public float getPoid() {
        return poid;
    }
}
