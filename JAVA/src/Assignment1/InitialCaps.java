package Assignment1;

public class InitialCaps {

	public static void main(String[] args) {
		String str="one two three";
		String []s=str.split(" ");
		String res="";
		for(int j=0;j<s.length;j++) {
			char[]ch=s[j].toCharArray();

			String temp="";
			for(int i=0;i<ch.length;i++) {
				if(i==0) {
					ch[i]-=32;
				}
				else {
					ch[i]=ch[i];}
				temp=temp+ch[i];
			}
			res=res+temp+" ";
		}
		System.out.println(res);
	}
}
