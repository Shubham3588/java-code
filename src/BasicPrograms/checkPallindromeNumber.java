package BasicPrograms;

public class checkPallindromeNumber {
    public static void main(String[] args) {
        checkPallindrome(0);
    }
    public static void checkPallindrome(int num){
        int rev =0;
        int s= num;
        while(num>0){
            int d=num%10;
            rev = rev*10+d;
            num = num/10;
        }
        if(rev == s){
            System.out.println("Pallindrome");
        }else System.out.println("Not Pallindrome");
    }
}
