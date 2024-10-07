package basicProgram;

import java.util.Scanner;

public class maximumOfThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");

        int n1= sc.nextInt();

        System.out.println("Enter the Second number");

        int n2= sc.nextInt();

        System.out.println("Enter the third number");

        int n3= sc.nextInt();

        maxNumber(n1,n2,n3);

    }

    public static void maxNumber(int a,int b,int c){

        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>a && b>c){
            System.out.println("B is greater");
        } else{
            System.out.println("C is greater");
        }

    }
}
