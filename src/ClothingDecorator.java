// decorator ac
public abstract class ClothingDecorator implements Clothing {
    protected Clothing decoratedClothing;

    public ClothingDecorator(Clothing decoratedClothing) {
        this.decoratedClothing = decoratedClothing;
    }

    @Override
    public String getDescription() {
        return decoratedClothing.getDescription();
    }

    @Override
    public double cost() {
        return decoratedClothing.cost();
    }
}
