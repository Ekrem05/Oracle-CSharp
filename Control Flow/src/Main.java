//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int switchValue = 5;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4,5,6:
                System.out.println("Value was 4 or 5 or 6");
                break;

            default:System.out.println("Value was not 1 or 2 or 3");
        }

        String q=getQuarter("NOVEMBER");
        System.out.println(q);
    }

    public static String getQuarter (String month){
        return switch (month){
            case "JANUARY","FEBRUARY","MARCH" -> "1ST";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}