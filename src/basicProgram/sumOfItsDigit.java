package basicProgram;

import java.util.Scanner;

public class sumOfItsDigit {
    public static void main(String[] args) {
        int digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        digit = sc.nextInt();
        int sum =0;
        while(digit>0){

            sum = sum+digit%10;
            digit=digit/10;

        }
        System.out.println(sum);

    }
}
