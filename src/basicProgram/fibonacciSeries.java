package basicProgram;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        int f1=0 ,f2=1,f3=0;
        System.out.println(f1+ " ");
        System.out.println(f2+ " ");

        for(int i=0;i<=n;i++){
            f3= f1+f2;
            System.out.println(f3+ " ");

            f1=f2;
            f2=f3;





        }
    }



}
