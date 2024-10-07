package basicProgram;

public class addTwoNumbers {
    public static void main(String[] args) {
        int a=25;
        int b = 35;
        add(a,b);
        int c=10;
        int d= 20;
        int e = 45;
        add(c,d);

    }
    static void add(int x,int y){
        System.out.println(x+y);
    }
}
