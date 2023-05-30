public class Product extends Menu{
    private final double price;
    private int cnt = 1;

    public Product(String name, double price, String desc) {
        super(name, desc);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return super.getName() +" | "+price+" | "+super.getDesc();
    }
    public String toString_cnt() {
        return super.getName() +" | "+price+" | "+cnt+"개 | "+super.getDesc();
    }

}
