package Assignment1;

import java.util.Scanner;

public class AlternateUpperNLower {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String text = s.next();
		String st=text.toUpperCase();
		char ch[]=st.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++) {
			if(i%2==0) {
				res=res+ch[i];
			}
			else {
				ch[i]+=32;
				res=res+ch[i];
			}
		}
		System.out.println(res);
	}

}
