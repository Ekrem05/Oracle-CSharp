//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String bulletIt = "Print a Bulleted List: \n" +
               "\t \u2022 First Point\n" +
               "\t\t\u2022 Sub Point";
       System.out.println(bulletIt);

       String textBlock = """
              Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";
       System.out.println(textBlock);
       System.out.printf("Age: %d%n",35);
       System.out.printf("Age: %.2f\n",35.43);

        System.out.printf("Age: %6d\n",35);
        System.out.printf("Age: %6d\n",356);
        System.out.printf("Age: %6d\n",3577);
        System.out.printf("Age: %6d\n",388866);

        String formatted = String.format("Your age is: %d\n",65);
        String second = "Format age: %d\n".formatted(51);
        System.out.printf(formatted);
        System.out.printf(second);


    }
}