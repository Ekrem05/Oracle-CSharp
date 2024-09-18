public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertable;

    public Car(String make, String model, String color, int doors, boolean convertable) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertable = convertable;
    }
    public Car(String make, String model, String color) {
        setMake(make);
        this.model = model;
        this.color = color;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void describeCar(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Doors: " + doors);
        System.out.println("Convertable: " + convertable);
    }
}
