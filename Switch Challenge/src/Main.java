//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char codeMess = 'R';
        System.out.println(getNatoDesizgnation(codeMess));
    }
    public static String getNatoDesizgnation(char letter){
        return switch (letter) {
            case 'A' -> "Alpha";
            case 'B' -> "Bravo";
            case 'C' -> "Charlie";
            case 'D' -> "Delta";
            case 'E' -> "Echo";
            case 'F' -> "Foxtrot";
            case 'G' -> "Golf";
            case 'H' -> "Hotel";
            case 'I' -> "India";
            case 'J' -> "Juliett";
            case 'K' -> "Kilo";
            case 'L' -> "Lima";
            case 'M' -> "Mike";
            case 'N' -> "November";
            case 'O' -> "Oscar";
            case 'P' -> "Papa";
            case 'Q' -> "Quebec";
            case 'R' -> "Romeo";
            case 'S' -> "Sierra";
            case 'T' -> "Tango";
            case 'U' -> "Uniform";
            case 'V' -> "Victor";
            case 'W' -> "Whiskey";
            case 'X' -> "X-ray";
            case 'Y' -> "Yankee";
            case 'Z' -> "Zulu";
            default -> "Invalid letter";
        };
    }
}