//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            String mystring = "Hello World";
            int length = mystring.length();
            System.out.printf("Length = %d%n",length);
            System.out.printf("First char = %c%n",mystring.charAt(0));

            String blank = "\t      \n";
            if(blank.isBlank()){
                System.out.printf("Its blank \n");
            }
            if(blank.isEmpty()){
                System.out.printf("Its empty \n");
            }

            System.out.println(mystring.indexOf('e'));
            System.out.println(mystring.indexOf("World"));

            String Firsubstring = mystring.substring(0,5);
            String Secsubstring = mystring.substring(6);
            System.out.println(Secsubstring);
            System.out.println(String.join(" ",Firsubstring,Secsubstring));
            System.out.println(mystring.replace("l","1"));

            System.out.println("-".repeat(20));
            System.out.println("HELLOO".indent(5));
            System.out.println("-".repeat(20));

        }
    }
}