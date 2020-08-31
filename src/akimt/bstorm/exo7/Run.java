package akimt.bstorm.exo7;

public class Run{
    public static void main(String[] args) {

        Musicien<Guitare> mus = new Musicien<>(15,"pol");

        mus.acheter(new Guitare("yamaha", "model2", 1));
        mus.acheter(new Guitare("...", "...", 100));
        mus.jouer(new Guitare("ibanez", "1025", 100));

        System.out.println("--------------------");

        for ( Guitare instru : mus.getInstruPossede() ) {
            mus.jouer( instru );
        }

        System.out.println(mus.getSolde());
    }
}
