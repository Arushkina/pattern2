// zize decorator
public class SizeDecorator extends ClothingDecorator {
    private String size;

    public SizeDecorator(Clothing decoratedClothing, String size) {
        super(decoratedClothing);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (" + size + " size)";
    }

    @Override
    public double cost() {
        double extraCost = 0;

        // Add cost based on size
        switch (size) {
            case "S":
                extraCost = 5.0;
                break;
            case "M":
                extraCost = 7.0;
                break;
            case "L":
                extraCost = 10.0;
                break;
        }

        return super.cost() + extraCost;
    }
}
