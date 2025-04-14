package Methods;

public class DisplayHighScore {
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to gett into position " + playerPosition + " in a high score list");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else
            return 4;
    }
    public static void main(String[] args) {
        displayHighScorePosition("Shubham", calculateHighScorePosition(1500));
        displayHighScorePosition("Ankit", calculateHighScorePosition(500));
    }
}
