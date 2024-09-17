//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double inches = convertToCentimeters(6,2);
        System.out.println(inches);
    }
    public static double convertToCentimeters(int inches){
        return inches * 2.54d;
    }
    public static double convertToCentimeters(int feet, int inches){
        int inchesOnly =  (12 * feet) + inches;
        return convertToCentimeters(inchesOnly);
    }
}