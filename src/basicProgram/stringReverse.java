package basicProgram;

public class stringReverse {
    public String reverse() {
        String str = "I am Shubham";
        String rev = "";
        int length = str.length();
        for(int i = length-1;i>=0;i--){
            char ch = str.charAt(i);
            rev= rev+ch;


        }
        return rev;
    }
}
