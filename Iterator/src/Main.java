import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");

        iterate(list);


    }

    public static void iterate(LinkedList<String> list) {
        System.out.println(list);
        //var iterator = list.iterator();
        var iterator = list.listIterator();
        while(iterator.hasNext()) {

            if(iterator.next().toLowerCase().equals("c")) {
                iterator.add("Insert here");
            }
        }
        System.out.println(list);

        while(iterator.hasNext()) {
            //false
            System.out.println(iterator.next());
        }

        //move backwards
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println(list);
    }
}