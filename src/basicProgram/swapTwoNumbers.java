package basicProgram;

import java.util.Scanner;

public class swapTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2= sc.nextInt();
        swapNumbers(n1,n2);



    }

    public static void swapNumbers(int a,int b){
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value of a is" + a);
        System.out.println("The value of b is" + b);

    }

}
