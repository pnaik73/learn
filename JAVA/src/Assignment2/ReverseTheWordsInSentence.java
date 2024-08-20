package Assignment2;
/*
 * input: Hello I am a good boy
 * output: boy good a am I Hello
 */
public class ReverseTheWordsInSentence {

	public static void main(String[] args) {
		String str="Hello I am a good boy";
		String[] s = str.split(" ");String output="";
		for(int i=s.length-1;i>=0;i--) {
			output=output+s[i]+" ";
		}
		System.out.println(output);
	}

}
