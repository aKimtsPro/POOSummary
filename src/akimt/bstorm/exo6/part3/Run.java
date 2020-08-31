package akimt.bstorm.exo6.part3;

public class Run {
    public static void main(String[] args) {

        Ingredient oignon = new Ingredient("oignon", 5);
        Ingredient fromage = new Ingredient("fromage", 10);
        Ingredient poivron = new Ingredient("poivron", 5);
        Ingredient olive = new Ingredient("olive", 5);
        Ingredient concombre = new Ingredient("concombre", 5);
        Ingredient ananas = new Ingredient("ananas", 5);
        Ingredient tomate = new Ingredient("tomate", 4);
        Ingredient pate = new Ingredient("pate", 1 );

        Pizza.banlistGlobal.add( oignon.getNom() );

        Pizza p = new Pizza("pizza");
        p.voirIng();
        p.addIngredient(tomate);
        p.voirIng();
        p.addIngredient(tomate);
        p.voirIng();

        Pizza.addToBasic(oignon);


    }
}
