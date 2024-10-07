package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class sumOfFiveValidIntegerUsingWhileLoop {
    public static void main(String[] args) {
   int counter =1;
   int sum =0;
   Scanner sc = new Scanner(System.in);
   while(counter<=5){
       try {
           System.out.println("Enter the number " + counter);
           int num = sc.nextInt();
           counter++;
           sum = sum + num;

       }

       catch(InputMismatchException ime){
           System.out.println("Enter valid number");
       }


   }
        System.out.println("Sum:"+sum);


    }

}
