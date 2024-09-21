import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Animal animal = new Dog("Rex",2);
//        animal.eat();
        Store store = new Store(getProductsForSale());
        ArrayList<ProductForSale> productsInStore=store.getProductForSale();

        for(ProductForSale item:productsInStore){
            item.showDetails();
        }

        store.addOrderItem(new OrderItem(3,store.getProductForSale().get(4)));
        store.addOrderItem(new OrderItem(5,store.getProductForSale().get(1)));

        store.printOrders();

    }

    public static ArrayList<ProductForSale> getProductsForSale() {
        ArrayList<ProductForSale> products = new ArrayList<>();
        products.add(new TShirt(12.3,"Nike Just Do It Pink"));
        products.add(new TShirt(12.4,"Nike Just Do It Red"));
        products.add(new TShirt(14.3,"Gym Shark Navy Blue"));
        products.add(new TShirt(17.5,"Gym Shark Green"));
        products.add(new TShirt(13.1,"Supreme fanatic"));
        return products;
    }
}