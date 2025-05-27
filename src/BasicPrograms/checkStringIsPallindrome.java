package BasicPrograms;

public class checkStringIsPallindrome {
    public static void main(String[] args) {
        checkStringPallindrome("ISI");
    }
    public static void checkStringPallindrome(String str){
        String rev = "";
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        if(str.equals(rev)){
            System.out.println("Pallindrome");
        }else System.out.println("Not Pallindrome");
    }
}
