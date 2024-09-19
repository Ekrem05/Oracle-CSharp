import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    record GroceryItem(String name, String type, int count){}
    public static void main(String[] args) {
        ArrayList<GroceryItem> list = new ArrayList<>();
        list.add(new GroceryItem("Yogurt","Food",3));
        list.add(new GroceryItem("Eggs","Food",3));
        list.add(new GroceryItem("Tires","Car part",2));

        System.out.println(list.toString());
    }
}