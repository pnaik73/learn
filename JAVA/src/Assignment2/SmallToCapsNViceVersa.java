package Assignment2;
//input :My Name is Arun
//output:mY nAME IS aRUN

public class SmallToCapsNViceVersa {

	public static void main(String[] args) {
		String s="My Name is Arun";
		char[]ch=s.toCharArray();String st="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]-=32;
			}
			else if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]+=32;
			}
			st=st+ch[i];
		}
		System.out.println(st);
	}
}
