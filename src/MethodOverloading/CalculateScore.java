package MethodOverloading;

public class CalculateScore {
    public static void main(String[] args) {

        int newScore = calculateScore("Shubham", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(85);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player " + " Scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player ");
        return 0;
    }
}
