//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3900));
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid value, seconds must be a positive integer";
        }
        return getDurationString(seconds / 60,seconds % 60);
    };

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0){
            return "Invalid value, seconds must be a positive integer";
        }
        if(seconds < 0 || seconds > 59){
            return "Invalid value, minutes must be a between 0 and 59";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds+"s ";
    };
}