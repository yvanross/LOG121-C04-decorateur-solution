package Decorateur.Coffee;

public abstract class CoffeeDecorator implements ICoffee {
    private final ICoffee decoratedCoffee;

    public CoffeeDecorator(ICoffee c) {
        this.decoratedCoffee = c;
    }

    // @Override
    public Double getCost() { 
        return decoratedCoffee.getCost();
    }

    // @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}