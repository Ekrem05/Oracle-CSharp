import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;

        double[] doubleArray = new double[10];
        doubleArray[4] = 4.4;


        int[] init = {3,4,2,4,5,6,7,8,1,33};
        for (int i = 0; i < init.length; i++   ) {
            System.out.println(init[i]);
        }

        for(int element : init){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(init));


        Arrays.sort(init);
        int[] smallerArray = Arrays.copyOf(init,5);

        String[] names = {"John", "Kevin", "Ema", "Lazar", "Abdul"};
        Arrays.sort(names);
        if(Arrays.binarySearch(names,"Abdul") == -1){

        }
        int[] newArray = {3,6,7,1,2,2,1,8,7,5};
        bubbleSortDescednding(newArray);
        System.out.println("sorted: "+Arrays.toString(newArray));

    }
    public static void bubbleSortDescednding(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }


}