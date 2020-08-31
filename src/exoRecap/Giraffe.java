package exoRecap;

import java.util.Random;

public class Giraffe extends Animal implements Galopant{

    private Veterinaire<Giraffe> vetoDedie;

    public Giraffe(String nom, char sexe, Veterinaire<Giraffe> veto) {
        super(nom, sexe, Etat.SANTE);
        this.setVetoDedie(veto);
    }


    public Veterinaire<Giraffe> getVetoDedie() {
        return vetoDedie;
    }

    public void setVetoDedie(Veterinaire<Giraffe> vetoDedie) {
        if (vetoDedie != null)
            vetoDedie.getRespAnimal().remove(this);

        this.vetoDedie = vetoDedie;
        this.vetoDedie.getRespAnimal().add(this);
    }

    // Overrides

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
