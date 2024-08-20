package Assignment2;
//input: Ab2hishek12 
//output: Abhishek

public class RemoveNumbersFrmString {

	public static void main(String[] args) {
		String s="pri14Yan589Ka";
		char[]c= s.toCharArray();String str="";
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a'&&c[i]<='z') {
				str=str+c[i];
			}
			else if(c[i]>='A'&&c[i]<='Z') {
				str=str+c[i];
			}
		}
		System.out.println(str);
	}
}
