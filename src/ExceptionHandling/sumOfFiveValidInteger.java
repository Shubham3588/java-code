package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class sumOfFiveValidInteger {

    public static void main(String[] args) {
      //  int n=1;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        try{
            for(int n=1;n<=5;n++){
                System.out.println("Enter the number" +n);
                int num = sc.nextInt();

                sum = sum+num;
            }
            System.out.println("Sum = " +sum);


        }
        catch(InputMismatchException ime){
            System.out.println("Enter a valid integer");
        }




    }




}
