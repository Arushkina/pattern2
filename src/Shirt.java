// concrete cl itm
public class Shirt implements Clothing {
    @Override
    public String getDescription() {
        return "Basic Shirt";
    }

    @Override
    public double cost() {
        return 20.0;
    }
}
