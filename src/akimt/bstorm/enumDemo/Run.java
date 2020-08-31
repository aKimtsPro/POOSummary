package akimt.bstorm.enumDemo;

public class Run {
    public static void main(String[] args) {

        Chien chien1 = new Chien("fido", RaceChien.DALMATIEN);
        Chien chien2 = new Chien("rex", RaceChien.CHIHUAHUA);
        Chien chien3 = new Chien("pico", RaceChien.DALMATIEN);



        System.out.println( chien1.getRace().getTailleMoyenne() );
    }
}
