//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        boolean isAlien = false;
//
//        //Conditionals
//        if(isAlien){
//            System.out.println("Alien");
//        }
//        else {
//            System.out.println("Not Alien");
//        }
//
//        int topScore = 100;
//
//        if(topScore>=100){
//            System.out.println("Top score is greater than 100");
//        }
//
//        int secondTopScore = 200;
//
//        if(secondTopScore>topScore && secondTopScore<300){
//            System.out.println("Second top score is less than 300");
//        }
//        if(secondTopScore<topScore || secondTopScore<300){
//            System.out.println("Second top score is less than 300");
//        }
//
//        //Ternary Operator
//        String makeOfCar = "Volkswagen";
//        boolean isDomestic = makeOfCar == "Mercedes-Benz" ? true : false;
//        if(isDomestic){
//            System.out.println("Domestic");
//        }

        double first = 20.00d;

        double second = 80.00d;

        double sum = (first + second) * 100;

        double remainder = sum % 40.00d;

        boolean isValid = remainder == 0.00d ? true : false;

        System.out.println(isValid);

        if (!isValid) {
            System.out.println("got some remainder");
        }



    }
}