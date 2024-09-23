import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String>emails;
    private Set<String>phones;

    public Contact(String name) {
        this(name,null,null);
    }

    public Contact(String name, String email) {
        this(name,email,null);
    }
    public Contact(String name, Long phone) {
       this(name,null,phone);
    }
    public Contact(String name, String email, Long phone) {
        this.name = name;
        emails=new HashSet<>();
        if(email != null){
            emails.add(email);
        }
        phones=new HashSet<>();
        if(phone != null && phone > 0){
            String phoneAsString = Long.toString(phone);
            String formattedPhone = "("+phoneAsString.substring(0,3)+")"+" "+phoneAsString.substring(3,6)+"-"+phoneAsString.substring(6);
            phones.add(formattedPhone);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name:%s , Phones:%s, Emails:%s".formatted(name,phones,emails);
    }

    public Contact mergeContactData(Contact contact){
        Contact newContact = new Contact(name);
        newContact.emails.addAll(emails);
        newContact.phones.addAll(phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return 33*getName().hashCode();
    }
}
