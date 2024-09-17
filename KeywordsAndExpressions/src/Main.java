//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;
        finalScore = calculateScore(gameOver, finalScore,levelCompleted, bonus);
        System.out.println("Your final score is: " + finalScore);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if(score == 5000){
            System.out.println("You win!");
        }
        else if(score < 5000){
            System.out.println("You lose!");
        }
        else {
            System.out.println("You cheat!");
        }
        if (gameOver){
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
}