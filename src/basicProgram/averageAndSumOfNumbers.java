package basicProgram;

public class averageAndSumOfNumbers {
    public static void main(String[] args) {
        averageAndSum(4,6);
    }

    public static void averageAndSum(int a,int b){
        int avg=0;
        int sum=0;

        avg = (a+b)/2;
        sum = a+b;
        System.out.println("The average is " +avg);
        System.out.println("The sum is " +sum);

    }

}
