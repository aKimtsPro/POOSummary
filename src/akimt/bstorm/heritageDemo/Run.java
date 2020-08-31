package akimt.bstorm.heritageDemo;

public class Run {

    public static void main(String[] args) {
        Pizza p1 = new Pizza(15);
        Sandwich s1 = new Sandwich("italien", 5, "tony", 10);

        p1.seFaireManger();
        s1.seFaireManger();
    }
}
