package PatronDecorateur.Patate;

import PatronDecorateur.Repas.IIngredient;
import PatronDecorateur.Repas.Ingredient;

public class Sauce extends Ingredient {

  public Sauce(IIngredient ingredient, Double cost, String description) {
    super(ingredient,cost,description);
    System.out.println("Add sauce at " + cost.toString());
  }
  

@Override
  public String getDescription() {
    return getiIngredient().getDescription() + ", " + super.getDescription();
  }
  
  @Override
  public double getCost() {
    return getiIngredient().getCost() + super.getCost();
  }

}
