package Decorateur.Coffee;
// The interface Coffee defines the functionality of Coffee implemented by decorator
public interface ICoffee extends Decorateur.Repas.IRepas {
    public Double getCost(); // Returns the cost of the coffee
    public String getDescription(); // Returns the ingredients of the coffee
}