package Assignment1;

public class PrintOnlySpecialCharacterInString {

	public static void main(String[] args) {
		String str="avhh@3hbj*6?,";
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
			}
			else if(ch[i]>='a'&&ch[i]<='z') {
			}
			else if(ch[i]>='0'&&ch[i]<='9') {
			}
			else {
				System.out.println(ch[i]);
			}
		}
	}
}
