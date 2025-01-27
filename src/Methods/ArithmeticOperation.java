package Methods;

public class ArithmeticOperation {

	public static void main(String[] args) {
		ArithmeticOperation ao = new ArithmeticOperation();
		ao.calculate(8, 9);
	}
	
	public void calculate(int a, int b) {
		
		int sum = a+b;
		System.out.println(sum);
		int mul = a*b;
		System.out.println(mul);
		int sub = a-b;
		System.out.println(sub);
		
	}

}
