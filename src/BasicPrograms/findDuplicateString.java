package BasicPrograms;

public class findDuplicateString {
    public static void main(String[] args) {
        int count =0;
        String str = "Shubhaaam";
        int len = str.length();
        for(int i=0;i<=len-1;i++)
        {

            for(int j=i+1;j<=len-1;j++){
                char ch = str.charAt(i);
                char chr = str.charAt(j);
                if(ch == chr)
                {
                    System.out.println(ch);
                    count++;
                   System.out.println(ch +"Repeating "+ count +"Times");

                }

            }

        }
    }
}
