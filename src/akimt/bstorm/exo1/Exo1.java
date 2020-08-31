package akimt.bstorm.exo1;

public class Exo1 {

    public static void main(String[] args) {

        Personne michel = new Personne("Michel", "10-10-2000");
        michel.saluer();

        Chien momo = new Chien(
                "momo",
                "01-01-2010",
                new Personne( "Paul", "05-05-2005" )
        );
        momo.aboyer();

        michel.caresser(momo);

        momo.setProprietaire(michel);
        momo.aboyer();

        if( michel == momo.proprietaire ){
            System.out.println("le meme objet\n\n\n");
        }
    }
}
