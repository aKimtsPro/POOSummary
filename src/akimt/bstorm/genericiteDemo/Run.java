package akimt.bstorm.genericiteDemo;

import akimt.bstorm.exo5.Voiture;
import akimt.bstorm.exo5.VoitureAmphibie;

public class Run {

    public static void main(String[] args) {

        Boite<Biscuit> boiteABiscuit = new Boite<>();

        boiteABiscuit.list.add(new Biscuit(10, "marque"));
        boiteABiscuit.list.add(new Biscuit(12, "marque"));
        boiteABiscuit.list.add(new Biscuit(10, "marque"));
        boiteABiscuit.list.add(new Biscuit(15, "marque"));
        boiteABiscuit.list.add(new Biscuit(8, "le biscuit"));

        System.out.println( boiteABiscuit.getCinquiemeContenu().getMarque() );
        System.out.println("Poid total de la boite: " + boiteABiscuit.getPoidTotal());


        Boite<Clou> boiteDeClou = new Boite<>();

        boiteDeClou.list.add(new Clou("A2"));
        boiteDeClou.list.add(new Clou("A2"));
        boiteDeClou.list.add(new Clou("A2"));
        boiteDeClou.list.add(new Clou("A2"));
        boiteDeClou.list.add(new Clou("bon clou"));

        System.out.println( boiteDeClou.getCinquiemeContenu().getType() );
        System.out.println("Poid total de la boite: " + boiteDeClou.getPoidTotal());
    }


}
