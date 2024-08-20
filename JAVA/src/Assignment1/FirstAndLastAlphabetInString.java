package Assignment1;

public class FirstAndLastAlphabetInString {

	public static void main(String[] args) {
		String str="Virat Kohli";
		String[]s=str.split(" ");
		for(int i=0;i<s.length;i++) {
			char[]ch=s[i].toCharArray();
			System.out.println(ch[0]);
			System.out.println(ch[s[i].length()-1]);
		}
	}
}
