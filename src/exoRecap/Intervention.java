package exoRecap;

import akimt.bstorm.sleepDemo.Vetement;

import java.time.LocalDate;

public class Intervention {

    private String nomVeto;
    private Animal animalSoigne;
    private final LocalDate DATE_INTERVENTION;
    private String description;

    public Intervention(String nomVeto, Animal animalSoigne, String description) {
        this.nomVeto = nomVeto;
        this.animalSoigne = animalSoigne;
        this.description = description;
        DATE_INTERVENTION = LocalDate.now();
    }

    public Intervention(String nomVeto, Animal animalSoigne) {
        this.nomVeto = nomVeto;
        this.animalSoigne = animalSoigne;
        DATE_INTERVENTION = LocalDate.now();
        this.setDescription(animalSoigne);
    }

    // Get/Set

    public String getNomVeto() {
        return nomVeto;
    }

    public void setNomVeto(String nomVeto) {
        this.nomVeto = nomVeto;
    }

    public Animal getAnimalSoigne() {
        return animalSoigne;
    }

    public void setAnimalSoigne(Animal animalSoigne) {
        this.animalSoigne = animalSoigne;
    }

    public LocalDate getDATE_INTERVENTION() {
        return DATE_INTERVENTION;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDescription(Animal animal){

        switch (animal.getEtat()){
            case SANTE:
                this.description = "Intervention inutile";
                break;
            case BLESSE:
                this.description = "Pansement des blessures";
                break;
            case MALADE:
                this.description = "Passage sous traitement";
                break;
            default:
                this.description = "erreur";

        }

    }

    // Overrides

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Nom du veterinaire: ").append(this.getNomVeto())
                .append("\nNom de l'animal: ").append(this.getAnimalSoigne().getNom())
                .append("\nDate d'intervention: ").append(this.getDATE_INTERVENTION())
                .append( "\nDescription: ").append(this.getDescription());

        return builder.toString();
    }
}
