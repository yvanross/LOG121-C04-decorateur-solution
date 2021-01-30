package PatronDecorateur;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Decorateur.Coffee.*;
import Decorateur.Patate.*;
import Decorateur.Pizza.*;
import Decorateur.Repas.*;

public class RepasTest
 {

    @Test
    public void repasTest(){
      
        IPizza pizza = new ThreeCheesePizza(10.5, "Pizza");
        assertEquals(10.5, pizza.getCost(),0.001);

        pizza = new Mozzarella(pizza);
        assertEquals(11,pizza.getCost(),0.001);

        ICoffee coffee =  new SimpleCoffee(1.0, "Coffee");
        assertEquals(1.0,coffee.getCost(),0.001);
        assertEquals("Coffee",coffee.getDescription());

        coffee =  new WithMilk(coffee);
        assertEquals(1.5,coffee.getCost(),0.001);
        assertEquals("Coffee, with milk",coffee.getDescription());

       IPatate patate = new Patate(3.55, "Patates du lac St-Jean");
       assertEquals(3.55, patate.getCost(),0.001);
       assertEquals("Patates du lac St-Jean", patate.getDescription());

       patate = new Sauce(patate);
       assertEquals(4.05, patate.getCost(),0.001);
       assertEquals("Patates du lac St-Jean, sauce", patate.getDescription());
       
       patate= new Fromage(patate);
       assertEquals(4.4,patate.getCost(),0.001);

    // Vous devez enlever les commentaires et faire les modifications nécessaires dans le code et dans ce test pour faire passer
    // celui-ci et calculer le cout total du repas.   
       Repas repas = new Repas();
       repas.add((IRepas)pizza);
       repas.add((IRepas)coffee);
       repas.add((IRepas)patate);
       assertEquals(16.9,repas.getCost(), 0.001);    

       String expected = "Pizza, mozzarella\nCoffee, with milk\nPatates du lac St-Jean, sauce, fromage\n";

       System.out.println("expected=" + expected);
    System.out.println("----");
       System.out.println("received=" + repas.getDescription());
       System.out.println("----");
       assertEquals(expected, repas.getDescription());
    

       repas.add((IRepas) new ThreeCheesePizza(10.0, "Pizza"));
       repas.add((IRepas) new SimpleCoffee(1.0, "Coffee"));
       repas.add((IRepas) new Patate(3.0, "Patates frites"));
       assertEquals(30.9,repas.getCost(), 0.001);
    }
}


// Assurer vous que le code suivant génère une erreur de compilation. C'est à dire qu'on ne peut pas décorer un item sans l'utilisation de son propre décorateur.
// IPizza pizza = new ThreeCheesePizza(10.5, "Pizza");
// IPatate patate = new Sauce(pizza);
      