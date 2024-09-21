//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(3); //unnecessary boxing
        Integer b = 33; //auto boxing
        int c = b; //auto unboxing
        int d = b.intValue(); // unnecessary unboxing

    }
}