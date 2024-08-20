package Assignment2;

import java.util.Scanner;

//asc123bsd4" output: sum=127

public class SumOfDigits2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		char[] ch=str.toCharArray();
		char[] t=ch;int sum=0;
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]) {
				sum=sum*10+(ch[i]-48);
			}
			else {
				
			}
		}
		System.out.println(sum);
	}

}
