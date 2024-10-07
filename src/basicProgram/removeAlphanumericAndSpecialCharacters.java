package basicProgram;

public class removeAlphanumericAndSpecialCharacters {

    public static void main(String[] args) {
        String str = "Wipro 33 66 88 #$#";

        // Step 1: Remove non-alphabetic characters
        String alphabeticStr = str.replaceAll("[^a-zA-Z]", "");

        // Step 2: Convert to lowercase
        String lowerCaseStr = alphabeticStr.toLowerCase();

        // Step 3: Remove vowels
        String result = lowerCaseStr.replaceAll("[aeiou]", "");

        System.out.println(result);


    }
}
