//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Lemon");
        builder.reverse();
        System.out.println(builder);

        builder.insert(0,"Reversed Lemon: ");
        System.out.println(builder);
    }
}