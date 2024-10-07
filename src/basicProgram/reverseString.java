package basicProgram;

public class reverseString {
    public static void main(String[] args) {
        String rev=" ";
        String s = "Shubham";
        int length = s.length();
        for(int i=length-1;i>=0;i--){
            char ch = s.charAt(i);
            rev= rev+ch;
        }
        System.out.println(rev);
    }
}
