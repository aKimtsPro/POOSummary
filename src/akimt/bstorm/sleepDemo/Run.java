package akimt.bstorm.sleepDemo;

import javafx.beans.binding.ObjectExpression;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Avant sleep");

        Thread.sleep(5000);

        Vetement v= new Vetement();
        v.couleur = "magenta";
        if( v.trendy() ){
            System.out.println("You're nice looking.");
        }
        else
            System.out.println("So 2019...");


        Vetement.testTendance = (vetement) -> {
            return vetement.couleur.length() > 5;
        };

        if( v.trendy() )
            System.out.println("You're nice looking.");
        else
            System.out.println("So 2019...");


        Vetement.testTendance = Vetement::trendy;

        if(v.trendy())
            System.out.println("You're nice looking.");
        else
            System.out.println("So 2019...");

        System.out.println("Après sleep");

    }
}
