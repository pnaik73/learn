package Assignment1;

public class Pallindrome {

	public static void main(String[] args) {
		String str="Malayalam";
		String rev="";
		char []ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("pallindrome");
		}
		else
			System.out.println("not a pallindrome");
	}
}
