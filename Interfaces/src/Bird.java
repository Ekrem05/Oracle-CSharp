public class Bird implements FlightEnabled,Trackable{

    @Override
    public void takeOff() {
        System.out.println("Taking off");
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void track() {
        System.out.println("Tracking");
    }

}
