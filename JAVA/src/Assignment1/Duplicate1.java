package Assignment1;

public class Duplicate1 {

	public static void main(String[] args) {
		String input="Java is a programming language";
		String output="";
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			int n=(int)ch;
			if(n>=65 && n<=90 || n>=97 && n<=122 ||n==32 ) {
				if(output.indexOf(ch)==-1) {
				output+=ch;   }   }
		}

		System.out.println(output);
	}
}