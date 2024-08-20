package Assignment2;

public class UniqueCharacters {
	public static void main(String[] args) {
		String s="all the best";
		char[] c=s.toCharArray();
		boolean[]b=new boolean[c.length];int count=0;
		for(int i=0;i<c.length;i++) {
			if(b[i]==false) {
				count=1;
				for(int j=i+1;j<c.length;j++) {
					if(c[j]==c[i]) {
						count++;
						b[j]=true;
					}
				}
				if(count==1) {
					System.out.println(c[i]);
				}
			}
		}
	}
}
