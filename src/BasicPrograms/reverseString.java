package BasicPrograms;

public class reverseString {
    public static void main(String[] args) {
        String s = "Shubham Pandey";
        String rev ="";

        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);
    }
}
