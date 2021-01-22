package Decorateur.Pizza;

public class PizzaDecorator implements IPizza {
    private final IPizza decoratedPizza;

    public PizzaDecorator(IPizza c) {
        this.decoratedPizza = c;
    }

    public Double getCost() { 
        return decoratedPizza.getCost();
    }

    public String getDescription() {
        return decoratedPizza.getDescription();
    }
}