public class OrderItem {

    private int quantity;
    private ProductForSale product;

    public OrderItem(int quantity, ProductForSale product) {
        this.quantity = quantity;
        this.product = product;
    }
    @Override
    public String toString() {
        return "OrderItem{" + "quantity=" + quantity + ", product=" + product.getDescription() + '}';
    }

}
