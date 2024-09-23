import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        Map<String,Contact> map = new HashMap<>();

       for (Contact c : emails) {
           map.put(c.getName(),c);
       }
        map.forEach((k,v)->System.out.printf("%s -> %s \n",k,v));
       Set<String> keys = map.keySet();
    }

    public static void printCollection(String header, Collection<Contact> contacts){
        System.out.println("-------------------");
        System.out.println(header);
        for(Contact c : contacts){
            System.out.println(c);
        }
    }
}