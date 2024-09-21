public class TShirt extends ProductForSale{

    public TShirt(double price, String description){
        super("Outfit", price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("Get this t-shirt for %.2f, %s \n",getPrice(),getDescription());
    }
}
