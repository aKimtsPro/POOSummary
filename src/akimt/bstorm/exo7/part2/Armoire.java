package akimt.bstorm.exo7.part2;

import java.util.ArrayList;
import java.util.List;

public class Armoire<T extends Vaisselle> implements Pile<T>{
    private List<T> vaisselle = new ArrayList<>();

    @Override
    public T peek() {
        return this.vaisselle.get( this.vaisselle.size() - 1 );
    }

    @Override
    public T pop() {
        T vaisselle = peek();
        this.vaisselle.remove(vaisselle);
        return vaisselle;
    }

    @Override
    public void push(T toPush) {
        vaisselle.add(toPush);
    }

    public List<T> prendreVaisselle(int nbr){

        if(nbr > this.vaisselle.size())
            return null;

        List<T> aRecup = new ArrayList<>();

        for(int i = 0; i < nbr; i++){
            aRecup.add( pop() );
        }

        System.out.println("Vous récupèrez "+ nbr + "assiettes.");

        return aRecup;
    }

    public void poserVaisselle(List<T> aPoser){

        this.vaisselle.addAll( aPoser );

    }

    @Override
    public String toString() {
        StringBuilder stringified = new StringBuilder("L'armoire contient " + this.vaisselle.size() + " assiettes.\n");
        for ( T a: this.vaisselle ) {
            stringified.append("vaisselle de marque ").append(a.getMarque());
        }

        return stringified.toString();
    }
}
