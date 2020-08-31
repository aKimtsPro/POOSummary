package akimt.bstorm.heritageDemo;

public class Pizza extends Aliment{

    public int diametre;

    public Pizza( int diametre ) {
        super("pizza", 7.5F, "napolitaine");
        this.diametre = diametre;
    }

    @Override
    public void seFaireManger(){
        System.out.println( this.type + " se fait manger à grosse bouchées");
    }
}
