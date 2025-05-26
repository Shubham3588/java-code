package BasicPrograms;

public class reverseStringPreservingWhiteSpace {
    public static void main(String[] args) {
        String str = "Shubham Pandey priti";
        String[] splittedString = str.split(" ");
        for(int i=splittedString.length-1;i>=0;i--) {
            System.out.print(splittedString[i] + " ");
        }
    }
}
