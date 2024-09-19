import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = readIntegers();
        int min = findMin(array);
        System.out.println(min);
        reverse(array);
        System.out.println("reversed: "+ Arrays.toString(array));

    }

    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] arr = string.split(",");

        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = Integer.parseInt(arr[i].trim());
        }
        return result;
    }

    public static int findMin(int... array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void reverse(int[] array){
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-i-1]=temp;
        }
    }
}