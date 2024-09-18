//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Benz", "C63","yellow",2,false);

        System.out.println(myCar.getMake());
        myCar.describeCar();
    }
}