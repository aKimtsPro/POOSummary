package akimt.bstorm.collectionDemo;

import akimt.bstorm.exo1.Personne;

import java.util.HashMap;

public class RunMap {

    public static void main(String[] args) {

        Personne luc = new Personne("luc", "date" );
        Personne marie = new Personne( "marie", "date");

        HashMap<String, Personne> map = new HashMap<>();

        map.put(luc.nom, luc);

        map.forEach((key, value) -> {
            System.out.println("key: "+ key + "\nvalue: " + value.nom + "\n");
        });

        map.put( luc.nom, marie );

        map.forEach((key, value) -> {
            System.out.println("key: "+ key + "\nvalue: " + value.nom + "\n");
        });

    }
}
