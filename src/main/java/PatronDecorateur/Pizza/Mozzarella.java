package PatronDecorateur.Pizza;

import PatronDecorateur.Repas.IIngredient;
import PatronDecorateur.Repas.DecorateurIngredient;

public class Mozzarella extends DecorateurIngredient {

	public Mozzarella(IIngredient newPizza, Double cost, String description) {
		super(newPizza, cost, description);
		System.out.println("Adding Mozarella at " + cost.toString());
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza and adds " mozzarella" to it
	
	public String getDescription(){
		return getiIngredient().getDescription() + ", " + super.getDescription();
		
	}
	
	public Double getCost(){
		
		return getiIngredient().getCost() + super.getCost();
		
	}
	
}