//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (double rate = 2.0; rate <= 50; rate++) {

            double interestAmount = calculateInterest(10000,rate);
            System.out.println("10,000 at "+ rate + "% interest = " +interestAmount);
            System.out.println();
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate / 100);
    }
}