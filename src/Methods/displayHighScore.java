package Methods;

public class displayHighScore {

    public static void displayHighScorePosition(String playerName,int playerPosition){


        System.out.println(playerName+" managed to get into position" + " "+ playerPosition + " "+"on the high score list");
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
        else
            return 4;

    }

    public static void main(String[] args) {
       int playerPosition = calculateHighScorePosition(1500);
       displayHighScorePosition("Shubham",playerPosition);
         playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Raj",playerPosition);
        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Priti",playerPosition);
        playerPosition = calculateHighScorePosition(25);
        displayHighScorePosition("XYZ",playerPosition);

    }
}
