import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(List.of(2,3,1,3,33,124,56,47,888,554,24,67));

        list.stream()
                .filter(x->x%2==0)
                .distinct()
                .forEach(System.out::println);

        //Basically you can perform operations on a collection functionally
    }
}