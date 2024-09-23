import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printCollection("Emails",emails);
        printCollection("Phones",phones);

        Set<Contact> emailSet = new HashSet<>(emails);
        Set<Contact> phoneSet = new HashSet<>(phones);
        printCollection("Emails set",emailSet);
        printCollection("Phones set",phoneSet);
    }

    public static void printCollection(String header, Collection<Contact> contacts){
        System.out.println("-------------------");
        System.out.println(header);
        for(Contact c : contacts){
            System.out.println(c);
        }
    }
}