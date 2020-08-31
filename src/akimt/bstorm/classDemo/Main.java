package akimt.bstorm.classDemo;

import akimt.bstorm.accessDemo.Client;
import akimt.bstorm.accessDemo.Compte;
import akimt.bstorm.exo1.Chien;
import akimt.bstorm.exo1.Personne;

public class Main {

    public static void main(String[] args) {


        akimt.bstorm.accessDemo.Client client = new Client();
        Compte compte = new Compte(100, client, 10);

    }
}
