public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertable;



    public void describeCar(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Doors: " + doors);
        System.out.println("Convertable: " + convertable);
    }
}
