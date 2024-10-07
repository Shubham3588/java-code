package basicProgram;

public class oddEven {
    public static void main(String[] args) {
        oddEven(4);
        oddEven(9);


    }

    public static void oddEven(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
