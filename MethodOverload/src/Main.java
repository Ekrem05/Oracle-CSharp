//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calculateScore("Ekrem",23);
        calculateScore(26,"Ekrem");
        calculateScore(33);
    }
    public static int calculateScore(String player, int score){
        System.out.println("Player " + player + " score is " + score);
        return score * 1000;
    }
    public static int calculateScore(int score,String player ){
        System.out.println("Player " + player + " score is " + score);
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player score is " + score);
        return score * 1000;
    }
}