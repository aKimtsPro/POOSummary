package akimt.bstorm.exo3;

public class Exo3 {
    public static void main(String[] args) {

        Humain humain = new Humain("paul", "11 rue des avenues");

        humain.saluer();
        System.out.println();
        humain.saluer(2);
        System.out.println();
        humain.saluer("Coucou");
        System.out.println();
        humain.saluer(2, "coucou");
        System.out.println();
        humain.saluer("coucou", 2);
    }
}
