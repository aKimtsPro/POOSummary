package exoRecap;

import java.time.LocalDate;

public abstract class Animal {

    private String nom;
    private char sexe;
    private LocalDate dateNaiss;
    private Etat etat;

    // Constructors

    public Animal(String nom, char sexe, LocalDate dateNaiss, Etat etat) {
        this.nom = nom;
        this.sexe = sexe;
        this.dateNaiss = dateNaiss;
        this.etat = etat;
    }

    public Animal(String nom, char sexe, Etat etat) {
        this.nom = nom;
        this.sexe = sexe;
        this.etat = etat;
        this.dateNaiss = LocalDate.now();
    }

    // Methods

    public abstract void vivre() throws InterruptedException;

    // Get/Set

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public Etat getEtat() {
        return etat;
    }

    protected void setEtat(Etat etat) {
        this.etat = etat;
    }
}
