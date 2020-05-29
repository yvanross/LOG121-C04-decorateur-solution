package PatronDecorateur.Patate;

import PatronDecorateur.Repas.DecorateurIngredient;
import PatronDecorateur.Repas.IIngredient;

public class Sauce extends DecorateurIngredient {

	public Sauce(final IIngredient patate, final double cost, final String description) {
    super(patate,cost, description);
  }
  
  public Double getCost(){
    return super.getCost() + getiIngredient().getCost();
  }

  public String getDescription(){
    return getiIngredient().getDescription() + ", " +  super.getDescription();
  }

}
