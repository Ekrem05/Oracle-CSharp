//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        displayHighScorePosition("Ekrem",1);
        int pos = calculateHighScorePosition(999);
        System.out.println("High score position: "+pos);
    }
    public static void displayHighScorePosition(String player, int position){
        System.out.println(player+" managed to get into position "+ position + " in the high score list");
    }
    public static int calculateHighScorePosition(int playerScore){
       if(playerScore>=1000){
           return 1;
       }
       else if(playerScore>=500 && playerScore<1000){
           return 2;
       }
       else if(playerScore>=100 && playerScore<500){
           return 3;
       }
       return 4;
    }
}