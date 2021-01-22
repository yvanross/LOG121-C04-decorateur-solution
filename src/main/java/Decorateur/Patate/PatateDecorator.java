package Decorateur.Patate;

public  class PatateDecorator implements IPatate {
    private final IPatate decoratedPatate;

    public PatateDecorator(IPatate c) {
        this.decoratedPatate = c;
    }

    public Double getCost() { // Implementing methods of the interface
        return decoratedPatate.getCost();
    }

    public String getDescription() {
        return decoratedPatate.getDescription();
    }
}