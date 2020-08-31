package akimt.bstorm.interfaceDemo;

public class Run {
    public static void main(String[] args) {

        Grandissable grandissable = new Humain("marie", "01-01-0001");
        Grandissable grandissable2 = new Arbre("Epicea", 200);

        Grandissable tab[] = {
                new Humain("marie", "01-01-0001"),
                new Humain("marie", "01-01-0001"),
                new Arbre("Epicea", 200)
        };

        for(int i = 0; i < tab.length ; i++){
            tab[i].grandir();
        }

        Vivant vivant = new Humain("paul", "01-01-0001");
        ((Humain)vivant).grandir();

    }
}
