package Assignment2;

public class RevWithSpace {

	public static void main(String[] args) {
		String s="Hi How are you ?";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>0;i--) {
			char[] c = str[i].toCharArray();
			System.out.println(c);
//			for(int j=0;j<c.length;j++) {
//				String rev="";
//				rev=rev +c[i];
//				System.out.print(rev);
//			}
		}
	}
}
