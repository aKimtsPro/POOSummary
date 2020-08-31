package akimt.bstorm.accessDemo;

public class AccessDemo {
    public static void main(String[] args) {


        Client client = new Client();
        client.nom = "luc";
        client.dateNaiss = "20-01-1990";

        Compte compte = new Compte(100, client, 10);
        System.out.println( compte.getSolde() );

        compte.setSolde(10101);
        System.out.println( compte.getSolde() );

    }
}
