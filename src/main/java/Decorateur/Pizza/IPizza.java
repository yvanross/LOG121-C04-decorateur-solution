package Decorateur.Pizza;

public interface IPizza  extends Decorateur.Repas.IRepas {
	public String getDescription(); 
	public Double getCost();
}