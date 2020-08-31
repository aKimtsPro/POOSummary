package akimt.bstorm.exo7.part2;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {


        Armoire<Assiette> armoire = new Armoire<>();
        Armoire<Verre> armoire2 = new Armoire<>();

        List<Assiette> assiettes = new ArrayList<>();
        for (int i = 5; i > 0; i--) {
            assiettes.add(new Assiette("Disque", i+10));
        }


        armoire.poserVaisselle(assiettes);

        System.out.println( armoire );

        List<Assiette> retirer = armoire.prendreVaisselle(4);

        System.out.println( armoire );

        retirer = armoire.prendreVaisselle(2);

        System.out.println( armoire );
    }
}
