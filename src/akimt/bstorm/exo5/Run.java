package akimt.bstorm.exo5;

public class Run {
    public static void main(String[] args) {

        Roulant roul = new VoitureAmphibie(1000, "model", "rouge");
        roul.rouler();

        Navigant nav = new VoitureAmphibie(1000, "model", "rouge");
        nav.naviger();

        VoitureAmphibie voit = new VoitureAmphibie(1000, "model", "rouge");
        voit.naviger();
        voit.rouler();

        Navigant tab[] = {
                new VoitureAmphibie(1000, "model", "rouge"),
                new VoitureAmphibie(1000, "model", "rouge"),
                new VoitureAmphibie(1000, "model", "rouge")
        };

        testInter(new Voiture(1200, "mustang"));
        testInter(new VoitureAmphibie(1000, "model", "rouge"));
    }

    public static void testInter(Roulant roulant){
        roulant.rouler();
    }
}
