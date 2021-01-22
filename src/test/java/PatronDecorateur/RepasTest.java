package PatronDecorateur;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Decorateur.Coffee.*;
import Decorateur.Patate.*;
import Decorateur.Pizza.*;
// import Decorateur.Repas.*;

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

    // Vous devez enlever les commentaire et faire les modifications nécessaires pour faire passer
    // le code et calculer le cout total du repas.   
    //    Repas repas = new Repas();
    //    repas.add(pizza);
    //    repas.add(coffee);
    //    repas.add(patate);
    //    assertEquals(16.9,repas.getCost(), 0.001);
    //    assertEquals("Pizza, mozzarella\nCoffee, with milk\nPatates du lac St-Jean, sauce, fromage\n", repas.getDescription());

    //    repas.add(new ThreeCheesePizza(3.1, "Small Pizza"));
    //    assertEquals(20,repas.getCost(), 0.001);

    }
}