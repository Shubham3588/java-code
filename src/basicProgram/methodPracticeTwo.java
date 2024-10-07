package basicProgram;

public class methodPracticeTwo {
    public static void main(String[] args) {

       displayHighScorePosition("test 1",calculateHighScorePosition(1500));
        displayHighScorePosition("test 2",calculateHighScorePosition(1000));
        displayHighScorePosition("test 3",calculateHighScorePosition(500));
        displayHighScorePosition("test 4",calculateHighScorePosition(100));
        displayHighScorePosition("test 5",calculateHighScorePosition(25));

    }
    public static void displayHighScorePosition(String playersName,int position){
        System.out.println(playersName +" Managed to get position " + position + " On the score list ");

    }

    public static int calculateHighScorePosition(int score){
        int result=0;

        if(score>=1000){
            result =1;
        }
        else if(score>=500 && score<1000){
            result = 2;
        }
        else if(score>=100 && score<500){
            result=3;
        }
        else{
            result=5;
        }
        return result;
    }

}
