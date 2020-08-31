package akimt.bstorm.classDemo;

public class Pizza {

    float prix;
    int diametre;
    String type = "mozzarella";

    public Pizza(float prix, int diam){
        this.prix = prix;
        this.diametre = diam;
    }

    public void presenter(){
        System.out.println(
                "Pizza de type : " + this.type +
                "\nprix : " + this.prix +
                "\ndiametre : " + this.diametre
        );
    }
}
