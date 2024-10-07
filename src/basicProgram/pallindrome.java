package basicProgram;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        int rev=0,n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        int palli=n;
        while(n!=0){

            rev= rev*10+n%10;
            n=n/10;

        }
        if(rev==palli){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}
