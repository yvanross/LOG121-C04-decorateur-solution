package PatronDecorateur.Coffee;
import PatronDecorateur.Repas.*;

// Decorator WithMilk mixes milk into coffee.
// Note it extends CoffeeDecorator.
public class WithMilk extends Ingredient {
    public WithMilk(IIngredient ingredient, Double cost, String description) {
        super(ingredient,cost,description);
        System.out.println("Adding milk at " + cost.toString());
    }

    @Override
    public double getCost() { // Overriding methods defined in the abstract superclass
        return getiIngredient().getCost() + super.getCost();
    }

    @Override
    public String getDescription() {
        return getiIngredient().getDescription() + ", " + super.getDescription();
    }
}