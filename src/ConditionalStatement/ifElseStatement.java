package ConditionalStatement;

import java.util.Scanner;
public class ifElseStatement {
    public static void main(String[] args) {
        boolean gameOver = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        int lvlCompleted = 5;
        int bonus = 100;
        if(score<5000){
            System.out.println("Score less than 5000");
        }else if(score<0){
            System.out.println("Game not started");
        }
        else {
            System.out.println("Winner");
        }
    }
}
