import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add(0,"B");
        System.out.println(list);
        addElements(list);
        System.out.println(list);
        removeElements(list);
        System.out.println(list);
        retrieveElement(list);
    }

    public static void addElements(LinkedList<String> list){
        list.addFirst("Khalid");
        list.add("Kanye");
        list.addLast("Colman");

        //Queue methods
        list.offer("Kane");
        list.offerFirst("Jonathan");
        list.offerLast("Michael");

        //Stack methods
        list.push("Phantom");

    }

    public static void removeElements(LinkedList<String> list){
        list.remove(1);
        list.remove("Phantom");

        String removed=list.remove(); //removes the first element
        System.out.println(removed+" was removed");

        String popped = list.pop(); //removes the first element
        System.out.println(popped+" was popped");

        list.poll(); //removes the first element

        list.push("Phantom");
        list.push("Fury");
        list.push("Mayweather");
    }

    public static void retrieveElement(LinkedList<String> list){
        System.out.println(list.get(4));
        System.out.println(list.peek());
        System.out.println(list.getLast());
    }
}