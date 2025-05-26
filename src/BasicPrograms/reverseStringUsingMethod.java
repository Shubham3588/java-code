package BasicPrograms;

public class reverseStringUsingMethod {
    public static void main(String[] args) {
        reverseStringUsingMethod rs = new reverseStringUsingMethod();

        rs.reverseString("Shubham");
    }

    public void reverseString(String name){
        String rev = " ";
        for(int i=name.length()-1;i>=0;i--){
            char ch = name.charAt(i);
            rev = rev+ch;


        }

        System.out.println(rev);
    }
}
