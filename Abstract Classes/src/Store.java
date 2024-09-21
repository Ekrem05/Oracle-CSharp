import java.util.ArrayList;

public class Store {
    private ArrayList<ProductForSale> productForSale;
    private ArrayList<OrderItem> orders;

    public Store() {}

    public Store(ArrayList<ProductForSale> productForSale) {
        this.productForSale = productForSale;
        orders = new ArrayList<>();
    }

    public void addProductForSale(ProductForSale productForSale) {
        this.productForSale.add(productForSale);
    }
    public ArrayList<ProductForSale> getProductForSale() {
        return productForSale;
    }

    public void addOrderItem(OrderItem orderItem) {
        this.orders.add(orderItem);
    }

    public void printOrders(){
        for(OrderItem orderItem : orders){
            System.out.println(orderItem);
        }
    }

}
