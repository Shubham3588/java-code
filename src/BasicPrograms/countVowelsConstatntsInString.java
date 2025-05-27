package BasicPrograms;

public class countVowelsConstatntsInString {
    public static void main(String[] args) {
        countVowelsConstants("Priti");
    }
    public static void countVowelsConstants(String str){
        str = str.toLowerCase();
        int vowels=0,constant = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }
                else constant++;
            }
        }
        System.out.println("Vowels =" + vowels);
        System.out.println("Constant =" + constant);
    }
}
