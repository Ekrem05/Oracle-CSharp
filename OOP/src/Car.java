public class Car extends Vehicle {
    private String color;
    private int doors;
    private boolean convertable;

    public Car(String make, String model, int year, String color, int doors, boolean convertable) {
        super(make,model,year);
        this.color = color;
        this.doors = doors;
        this.convertable = convertable;
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

    @Override
    public String toString() {
       String base=super.toString();
       base = base + " "+color + " " + doors + " " + convertable;
       return base;
    }
}
