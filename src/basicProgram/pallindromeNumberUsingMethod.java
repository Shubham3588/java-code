package basicProgram;

public class pallindromeNumberUsingMethod {

    public static void main(String[] args) {
        checkPallindrome("MADAM1");

    }

    public static void checkPallindrome(String text){
        String rev = "";
        String check = text;
        int len = text.length();
        for(int i=len-1;i>=0;i--){
            rev= rev+text.charAt(i);
        }
        if(check.equals(rev)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}
