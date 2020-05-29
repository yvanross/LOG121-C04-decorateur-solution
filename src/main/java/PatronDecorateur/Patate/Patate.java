package PatronDecorateur.Patate;

import PatronDecorateur.Repas.IIngredient;

public class Patate implements IIngredient {
  private Double cost = 0.0;
  private String description = "";
  
  public Patate(double cost, String description) {
    System.out.println("Ajouter patage");
    this.cost = cost;
    this.description = description;

  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Double getCost() {
    return cost;
  }
  

}
