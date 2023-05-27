public class Product extends Menu{
    private final double price;

    public Product(String name, double price, String desc) {
        super(name, desc);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return super.getName() +" | "+price+" | "+super.getDesc();
    }
}
