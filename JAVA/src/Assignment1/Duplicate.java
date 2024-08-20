package Assignment1;

public class Duplicate {

	public static void main(String[] args) {
		String input="Java is a programming language";
		String output="";
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			char ch1=Character.toUpperCase(ch);
			char ch2=Character.toLowerCase(ch);
			if(output.indexOf(ch1)==-1 && output.indexOf(ch2)==-1) {
				output+=ch;
			}
		}
		System.out.println(output);
	}
}
