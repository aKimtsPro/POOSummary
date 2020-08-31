package akimt.bstorm.collectionDemo;

import akimt.bstorm.exo1.Chien;
import akimt.bstorm.exo1.Personne;

import java.util.ArrayList;

public class RunList {
    public static void main(String[] args) {


        ArrayList<Personne> list = new ArrayList<>();

        Personne luc = new Personne("luc", "01-01-0001");
        Personne marie = new Personne("marie", "20-20-2020");

        Object ob = new Object();

        list.add(luc);
        list.remove(luc);



    }
}
