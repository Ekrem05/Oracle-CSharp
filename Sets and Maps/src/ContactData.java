import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactData {
    private static final String phoneData = """
            Charlie Brown, 3334445555
            Maid Marion, 1234567890
            Mickey Mouse, 9998887777
            Mickey Mouse, 1247489758
            Minnie Mouse, 4567805666
            Robin Hood, 5647893000
            Robin Hood, 7899028222
            Lucy Van Pelt, 5642086852
            Mickey Mouse, 9998887777
            """;

    private static final String emailData = """
            Mickey Mouse, mckmouse@gmail.com
            Mickey Mouse, micky1@aws.com
            Minnie Mouse, minnie@verizon.net
            Robin Hood, rhood@gmail.com
            Linus Van Pelt, lvpelt2015@gmail.com
            Daffy Duck, daffy@google.com
            """;

    public static List<Contact> getData(String type){
        List<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(type.equalsIgnoreCase("phone")?phoneData:emailData);
        scanner.useDelimiter("\n");
        while(scanner.hasNext()){
            String line = scanner.next();
            String[]parts = line.split(",");
            String name = parts[0];
            String phoneOrEmail = parts[1];
            if(type.equalsIgnoreCase("phone")){
                contacts.add(new Contact(name, Long.parseLong(phoneOrEmail.trim())));
            }
            else{
                contacts.add(new Contact(name,phoneOrEmail));
            }
        }
        return contacts;
    }
}
