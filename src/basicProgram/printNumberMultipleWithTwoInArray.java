package basicProgram;

public class printNumberMultipleWithTwoInArray {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,4,8,10,9};
        for(int num:arr){
            if(num%2==0){
                System.out.println(num);
            }
        }

    }



}
