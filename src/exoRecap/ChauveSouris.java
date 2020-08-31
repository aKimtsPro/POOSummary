package exoRecap;

import java.util.Random;

public class ChauveSouris extends Animal implements Volant{

    private Veterinaire<ChauveSouris> vetoDedie;

    public ChauveSouris(String nom, char sexe, Veterinaire<ChauveSouris> veto) {
        super(nom, sexe, Etat.SANTE);
        this.setVetoDedie(veto);
    }

    @Override
    public void vivre() throws InterruptedException {
        while (this.getEtat() == Etat.SANTE)
            this.voler();
    }

    public Veterinaire<ChauveSouris> getVetoDedie() {
        return vetoDedie;
    }

    public void setVetoDedie(Veterinaire<ChauveSouris> vetoDedie) {
        if ( vetoDedie != null )
            vetoDedie.getRespAnimal().remove(this);

        this.vetoDedie = vetoDedie;
        this.vetoDedie.getRespAnimal().add(this);

    }

    @Override
    public void voler() throws InterruptedException{
        System.out.println(this.getNom() + " vole...");
        Thread.sleep(1000);

        Random rdm = new Random();
        int rslt = rdm.nextInt(100) + 1;

        if(rslt <= 20){
            this.setEtat(Etat.MALADE);
            System.out.println(this.getNom() + " tombe malade");
        }
        else if(rslt <= 30){
            this.setEtat(Etat.BLESSE);
            System.out.println(this.getNom() + " se blesse");
        }
    }

}
