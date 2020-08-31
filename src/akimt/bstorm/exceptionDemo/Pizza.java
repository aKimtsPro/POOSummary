package akimt.bstorm.exceptionDemo;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<Ingredient> ingredientList = new ArrayList<>();
    private String nom;
    private int circonference;
    private boolean cuite = false;

    // Constructeur

    public Pizza(List<Ingredient> ingredientList, String nom, int circonference) {
        this.setIngredientList(ingredientList);
        this.setNom(nom);
        this.setCirconference(circonference);
    }

    public Pizza(String nom, int circonference) {
        this.setNom(nom);
        this.setCirconference(circonference);
    }

    // Methods

    public void cuire(){
        // TODO implementer cuire
    }

    // Getter/Setter

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCirconference() {
        return circonference;
    }

    public void setCirconference(int circonference) {
        this.circonference = circonference;
    }

    public boolean isCuite() {
        return cuite;
    }

    public void setCuite(boolean cuite) {
        this.cuite = cuite;
    }
}
