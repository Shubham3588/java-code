package basicProgram;



public class forLoopsMainMethod {
    public static void main(String[] args) {
        forLoopMethod met = new forLoopMethod();

        for(double rate = 2.0;rate<=5.0;rate++){
            met.calculateInterest(10000,rate);
            System.out.println("Total interest on the interest rate " +  met.calculateInterest(10000,rate));
        }
        System.out.println("---------------------------------------------------------------");
        //calculateInterest(10000,2);
        for(double rate = 7.5;rate<=10.0;){
            rate= rate+0.25;
            met.calculateInterest(10000,rate);
            System.out.println("Total interest on the interest rate " +  met.calculateInterest(10000,rate));
        }



    }
}
