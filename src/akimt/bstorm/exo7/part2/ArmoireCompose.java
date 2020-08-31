package akimt.bstorm.exo7.part2;

import java.util.List;

public class ArmoireCompose {

    private final Armoire<Verre> ARMOIRE_A_VERRE = new Armoire<>();
    private final Armoire<Assiette> ARMOIRE_A_ASSIETTE = new Armoire<>();


    public List<Verre> prendreVerre(int nbr){
        return ARMOIRE_A_VERRE.prendreVaisselle(nbr);
    }

    public List<Assiette> prendreAssiette(int nbr){
        return ARMOIRE_A_ASSIETTE.prendreVaisselle(nbr);
    }

    public void poserVerre(List<Verre> aPoser){
        this.ARMOIRE_A_VERRE.poserVaisselle(aPoser);
    }
    public void poserAssiette(List<Assiette> aPoser){
        this.ARMOIRE_A_ASSIETTE.poserVaisselle(aPoser);
    }
}
