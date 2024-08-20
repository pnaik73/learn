package Assignment2;
/*
 * nput: Hello My name is Ram
   output: olleH yM eman si maR
 */
public class ReverseASentence {

	public static void main(String[] args) {
		String s="Hello My name is Ram";
		String[] str = s.split(" ");String output="";
		for(int i=0;i<str.length;i++) {

			char[] c = str[i].toCharArray();

			for(int x=c.length-1;x>=0;x--) {

				output=output+c[x];
			}
			output=output+" ";
		}
		System.out.println(output);
	}

}
