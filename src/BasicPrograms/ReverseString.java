package BasicPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Shubham";
		String str = "";
		for(int i = s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);			
			str = str+ch;
		}
		System.out.println(str);
	}
}
