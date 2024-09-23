import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[13];

        int number = 3;

        Arrays.fill(array, number);
        System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>(13);

        Collections.fill(list, number);
        System.out.println(list);

        List<String> list1 = Collections.nCopies(23,"init");
        System.out.println(list1);

        List<String> names = new ArrayList<>(Arrays.asList("John","David","Backam","Lina","Phantom","Fury"));
        System.out.println("Before shuffle: " + names);
        Collections.shuffle(names);
        System.out.println("After shuffle: " + names);


        Collections.reverse(names);
        System.out.println("After reverse: " + names);

        Collections.sort(names);
        System.out.println("After sort: " + names);

        int index = Collections.binarySearch(names,"John");
        System.out.println("Index: " + index);


    }
}