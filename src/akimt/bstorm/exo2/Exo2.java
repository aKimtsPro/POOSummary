package akimt.bstorm.exo2;

public class Exo2 {

    public static void main(String[] args) {

        Chien chien1 = new Chien("aauauauaauuaaaaaaaaaaaaaaaaa", "bouvier");
        Chien chien2 = new Chien("fifi", "shiba");
        Chien chien3 = new Chien("pico", "labrador");

        Personne jeanluc = new Personne("Jean-Luc", "21 rue des adresses", "10-10-1990");
        jeanluc.setChien(chien3);
        System.out.println(jeanluc.getChien().getNom());
    }
}
