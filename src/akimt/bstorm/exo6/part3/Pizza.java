package akimt.bstorm.exo6.part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {


    public static List<String> banlistGlobal = new ArrayList<>();
    private static List<Ingredient> ingDeBase = new ArrayList<>(){{
        System.out.println("ajout de première instanciation");
        add(new Ingredient("pate", 1));
        add(new Ingredient("tomate", 3));
    }};


    public List<String> banlistClient = new ArrayList<>();
   private String nom;
   private HashMap<String, Ingredient> ingredientList = new HashMap<>();
   private boolean cuite = false;

   // Constructors

    public Pizza(String nom, List<Ingredient> ingredientList) {
        this.nom = nom;

        for ( Ingredient ing : ingredientList ) {
            this.addIngredient( ing );
        }

        // Dans ce cas copie la liste. L'ajout de nouveaux ingredient n'influe que sur la presente pizza
        for ( Ingredient ing : ingDeBase ) {
            this.addIngredient( ing );
        }

    }

    public Pizza(String nom) {
        this.nom = nom;

        // Dans ce cas à l'ajout de nous ing de base, l'ajoute a toutes pizzas
//        this.setIngredientList( ingDeBase );
        for ( Ingredient ing : ingDeBase ) {
            this.addIngredient( ing );
        }
    }

    public Pizza(List<String> banlistClient, String nom) {
        this.banlistClient = banlistClient;
        this.nom = nom;

        // Dans ce cas copie la liste. L'ajout de nouveaux ingredient n'influe que sur la presente pizza
        for ( Ingredient ing : ingDeBase ) {
            this.addIngredient( ing );
        }
    }

    // Methods

    public boolean cuire(){

        if( this.cuite )
        {
            System.out.println("La pizza est deja cuite");
            return false;
        }

        if( this.ingredientList.size() < 3 || this.ingredientList.size() > 10 )
        {
            System.out.println("La cuisson est raté");
            return false;
        }

        System.out.println("La cuisson est réussie");
        this.setCuite(true);
        return true;
    }

    public boolean addIngredient(Ingredient ing){

        if( this.banlistClient.contains( ing.getNom() ) || banlistGlobal.contains( ing.getNom() ) )
        {
            System.out.println("Impossible d'ajouter un ingrédient banni");
            return false;
        }

        if( this.cuite ){
            System.out.println("Impossible d'ajouter un ingrédient sur une pizza cuite");
            return false;
        }

        if( ing.getQtt() >= 1 && ing.getQtt() <= 8 )
        {
            Ingredient ingred = ing;
            if( this.ingredientList.containsKey( ing.getNom() ) )
            {
                ingred = new Ingredient(
                        ing.getNom(),
                        Math.min(8, this.ingredientList.get(ing.getNom()).getQtt() + ing.getQtt())
                    );
            }

            this.ingredientList.put(ing.getNom(), ingred);
            return true;
        }

        System.out.println("L'ingrédient " + ing.getNom() + " n'a pas été ajouté.");
        return false;
    }

    public void voirIng(){
        this.ingredientList.forEach((key, value) -> {
            System.out.println(key + " ("+ value.getQtt() +")");
        });
    }

    public static void addToBasic(Ingredient ing){
        if( !banlistGlobal.contains( ing.getNom()) )
            ingDeBase.add( ing );
        else
            System.out.println("ajout d'ingredient basic inpossible");
    }

    // Get/Set

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private HashMap<String, Ingredient> getIngredientList() {
        return ingredientList;
    }

    private void setIngredientList(HashMap<String, Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public boolean isCuite() {
        return cuite;
    }

    public void setCuite(boolean cuite) {
        this.cuite = cuite;
    }


    private static List<Ingredient> getIngDeBase() {
        return ingDeBase;
    }

    private static void setIngDeBase(List<Ingredient> ingDeBase) {
        Pizza.ingDeBase = ingDeBase;
    }
}
