package PatronDecorateur.Coffee;
import PatronDecorateur.Repas.*;

// Decorator WithMilk mixes milk into coffee.
// Note it extends CoffeeDecorator.
public class WithMilk extends DecorateurIngredient {
    public WithMilk(IIngredient ingredient, Double cost, String description) {
        super(ingredient,cost,description);
        System.out.println("Adding milk at " + cost.toString());
    }

    @Override
    public Double getCost() { // Overriding methods defined in the abstract superclass
        return getiIngredient().getCost() + super.getCost();
    }

    @Override
    public String getDescription() {
        return getiIngredient().getDescription() + ", " + super.getDescription();
    }
}