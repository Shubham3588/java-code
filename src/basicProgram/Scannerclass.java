package basicProgram;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("EnterValue of a");
		a=sc.nextInt();
		System.out.println("EnterValue of b");
		b=sc.nextInt();
		System.out.println("EnterValue of c");
		c=sc.nextInt();
		
		int sum = a+b+c;
		System.out.println(sum);

	}

}
