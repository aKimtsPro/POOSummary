package akimt.bstorm.exo6.part1;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        Ingredient oignon = new Ingredient("oignon", 5);
        Ingredient fromage = new Ingredient("fromage", 10);
        Ingredient poivron = new Ingredient("poivron", 5);
        Ingredient olive = new Ingredient("olive", 5);
        Ingredient concombre = new Ingredient("concombre", 5);
        Ingredient ananas = new Ingredient("ananas", 5);
        Ingredient tomate = new Ingredient("tomate", 5);
        Ingredient pate = new Ingredient("pate", 1 );

        Pizza pizza = new Pizza("pizza", new ArrayList<>());

        pizza.setIngredientList(new ArrayList<>());
    }
}
