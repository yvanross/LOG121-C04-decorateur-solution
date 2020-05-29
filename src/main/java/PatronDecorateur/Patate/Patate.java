package PatronDecorateur.Patate;

import PatronDecorateur.Repas.IIngredient;

public class Patate implements IIngredient {
  private Double cost = 0.0;
  private String description="";

  public Patate(Double cost, String description) {
    System.out.println("Add Patate at " + cost.toString());
    this.cost = cost;
    this.description = description;
  }

  public double getCost() {
    return cost;
  }

  public String getDescription() {
    return description;
  }

}
