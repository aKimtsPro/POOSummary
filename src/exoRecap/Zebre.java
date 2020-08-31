package exoRecap;

import java.util.Random;

public class Zebre extends Animal implements Galopant {

    private Veterinaire<Zebre> vetoDedie;

    public Zebre(String nom, char sexe, Veterinaire<Zebre> veto) {
        super(nom, sexe, Etat.SANTE);
        this.setVetoDedie(veto);
    }

    public Veterinaire<Zebre> getVetoDedie() {
        return vetoDedie;
    }

    public void setVetoDedie(Veterinaire<Zebre> vetoDedie) {
        if ( this.vetoDedie != null )
            this.vetoDedie.getRespAnimal().remove(this);

        this.vetoDedie = vetoDedie;
        this.vetoDedie.getRespAnimal().add(this);
    }

    @Override
    public void vivre() throws InterruptedException {
        while(this.getEtat() == Etat.SANTE)
            this.galoper();
    }

    @Override
    public void galoper() throws InterruptedException{
        System.out.println(this.getNom() + " galope...");
        Thread.sleep(2000);

        Random rdm = new Random();
        int rslt = rdm.nextInt(100) + 1;

        if(rslt <= 20){
            this.setEtat(Etat.BLESSE);
            System.out.println(this.getNom() + " se blesse");
        }
        else if(rslt <= 30){
            this.setEtat(Etat.MALADE);
            System.out.println(this.getNom() + " tombe malade");
        }
    }
}
