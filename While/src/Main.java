//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(sumDigits(943));
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
    public static void printEvenOrOdd(int from,int to) {
        int number=from;
        while(number<=to){
            System.out.println(isEvenNumber(number)? number + " is Even": number + " is Odd");
            number++;
        }
    }
    public static int sumDigits(int number) {
        if(number<0){
            return -1;
        }

        int sum=0;

        while(number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}