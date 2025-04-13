package Methods;

public class CalculateScore {
    public static void calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score is" + finalScore);
        } else {
            System.out.println("Resume the game");
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score is" + finalScore);
        }
    }

    public static void main(String[] args) {
        calculatedScore(true, 800, 5, 100);
        calculatedScore(false, 700, 6, 500);
    }
}
