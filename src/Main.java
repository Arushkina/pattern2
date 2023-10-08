public class Main {
    public static void main(String[] args) {
        Clothing basicShirt = new Shirt();
        System.out.println("Description: " + basicShirt.getDescription() + ", Cost: $" + basicShirt.cost());

        Clothing mediumShirt = new SizeDecorator(new Shirt(), "M");
        System.out.println("Description: " + mediumShirt.getDescription() + ", Cost: $" + mediumShirt.cost());

        Clothing largeShirt = new SizeDecorator(new Shirt(), "L");
        System.out.println("Description: " + largeShirt.getDescription() + ", Cost: $" + largeShirt.cost());
    }
}