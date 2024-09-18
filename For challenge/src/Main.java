//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sum=0;
        int count=0;
        for (int i = 1; i <= 1000; i++) {

            if(i%2==0 && i%5==0){
                sum+=i;
                count++;
                System.out.println(i);
            }
            if(count ==5){
                break;
            }
        }
        System.out.println("The sum is: "+sum);
    }
}