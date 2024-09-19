import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        boolean exit=false;
        while(!exit){
            String menu = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number: """;
            System.out.print(menu);
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int action =Integer.parseInt(input);
            switch (action){
                case 0:exit=true;
                    break;
                case 1:
                    addItems(list);
                    printList(list);
                    break;
                case 2:
                    removeItems(list);
                    printList(list);
                    break;

            }
        }



    }
    public static void addItems(ArrayList<String> list){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        for(String item: input){
            if(!list.contains(item)){
                list.add(item);
            }
        }
    }
    public static void removeItems(ArrayList<String> list){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        while(true){
            for(String item: input){
                if(list.contains(item)){
                    list.remove(item);
                }
            }
            break;
        }
    }
    public static void printList(ArrayList<String> list){
        Arrays.sort(list.toArray());
        System.out.println("Current list "+String.join(",", list));
    }

}