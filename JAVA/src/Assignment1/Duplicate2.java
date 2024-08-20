package Assignment1;

public class Duplicate2 {

	public static void main(String[] args) {
		String s1="Java is a programming language";
		String s=s1.toLowerCase();
		char[]ch=s.toCharArray();
		String res="";
		boolean b[]=new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						b[i]=true;
					}
				}
				if(count==1) {
					res+=ch[i];
				}
			}
		}
		System.out.println(res);
	}
}
