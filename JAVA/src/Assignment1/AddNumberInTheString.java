package Assignment1;

import java.util.Scanner;

public class AddNumberInTheString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String text = s.next();
		char ch[]=text.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				sum=sum+(ch[i]-48);
			}
		}
		System.out.println(sum);
	}

}
