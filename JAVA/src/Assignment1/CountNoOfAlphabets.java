package Assignment1;

public class CountNoOfAlphabets {

	public static void main(String[] args) {
		String str="Abara ka dabra";
		String s=str.toLowerCase();
		char []ch=s.toCharArray();
		boolean[]b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(ch[i]+"==>"+count);
			}
		}
	}
}