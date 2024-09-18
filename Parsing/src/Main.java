//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println(getInputFromTerminal(2024));
        //System.out.println(getInputFromConsole(2024));
        int sum = calculateSum();
        System.out.println(sum);

    }

    public static String getInputFromTerminal(int currentYear){
        String name = System.console().readLine("What is your name?");
        System.out.println("Hi "+ name +"!");
        String date = System.console().readLine("What year were you born in");
        int age = currentYear - Integer.parseInt(date);
        return "So you are  "+ age +" years old";
    }

    public  static String getInputFromConsole(int currentYear){
        Scanner scanner =new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        int year= currentYear - age;
        return "So you are born in "+ year;
    }
    public  static int calculateSum(){
        Scanner scanner =new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (count<5){
            System.out.println("Enter a valid integer");
            String value = scanner.next();
            try{
                int number = Integer.parseInt(value);
                sum+=number;
                count++;
            }
            catch (Exception e){
                System.out.println("Invalid number");
            }
        }
        return sum;
    }
}