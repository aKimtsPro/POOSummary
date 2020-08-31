package exoRecap;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) throws InterruptedException{

        Veterinaire<Zebre> luc = new Veterinaire<>("luc");
        System.out.println("Luc: " + luc.getRespAnimal().size());

        Veterinaire<Zebre> marie = new Veterinaire<>("marie");
        System.out.println("Marie: " + marie.getRespAnimal().size());

        Zebre zebre = new Zebre("Rayure", 'M', luc);

        zebre.vivre();
        luc.soigner(zebre);
        zebre.vivre();
        marie.soigner(zebre);

        zebre.setVetoDedie(marie);
        marie.soigner(zebre);

        System.out.println("Luc: " + luc.getRespAnimal().size());
        System.out.println("Marie: " + marie.getRespAnimal().size());

        luc.afficherIntervention();
        marie.afficherIntervention();
    }
}
