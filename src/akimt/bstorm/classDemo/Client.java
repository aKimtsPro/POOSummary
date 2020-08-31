package akimt.bstorm.classDemo;

public class Client {

    String nom;
    String dateNais;
    Pizza bestPizza;

    public Client(String nom, String dateNais, Pizza bestPizza) {
        this.nom = nom;
        this.dateNais = dateNais;
        this.bestPizza = bestPizza;
    }

    public String favoritePizza(String message){
        return "Ma pizza préférée est " + bestPizza.type + ".\n" + message;
    }


}
