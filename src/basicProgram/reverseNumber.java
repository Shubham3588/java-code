package basicProgram;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int rev=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n= sc.nextInt();
        while(n>0){
            rev = rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);

    }
}
