public class Sneakers extends ProductForSale{

    public Sneakers(double price, String description) {
        super("Outfit", price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("Get these sneakers for %.2f, %s \n",getPrice(),getDescription());
    }
}
