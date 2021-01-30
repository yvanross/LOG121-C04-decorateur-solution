package Decorateur.Coffee;


// Decorator WithSprinkles mixes sprinkles onto coffee.
// Note it extends CoffeeDecorator.
public class WithSprinkles extends CoffeeDecorator {
    public WithSprinkles(ICoffee coffee) {
        super(coffee);
    }

    // @Override
    public Double getCost() {
        return super.getCost() + 0.2;
    }

    // @Override
    public String getDescription() {
        return super.getDescription() + ", with sprinkles";
    }
}