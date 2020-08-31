package akimt.bstorm.abstractDemo;

public class Run {
    public static void main(String[] args) {

        Joueur joueur = new Joueur("steve", 2);
        Guitare guitare = new Guitare(65,6, "Ibanez");
        Flute flute = new Flute(54, "traversière");

        joueur.jouer(guitare);
        joueur.jouer(flute);
    }
}
