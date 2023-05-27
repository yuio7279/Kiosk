import java.util.ArrayList;

public class Order {

    private final ArrayList<Product> wishlist;

    public Order() {
        this.wishlist = new ArrayList<>();
    }

    public ArrayList<Product> getWishlist() {
        return wishlist;
    }

    public void add(Product product){
        wishlist.add(product);
    }

    public void clear(){
        wishlist.clear();
    }

}
