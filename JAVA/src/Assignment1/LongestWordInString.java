package Assignment1;

public class LongestWordInString {

	public static void main(String[] args) {
		String s ="All the best";
		String []ar=s.split(" ");
		String longest="";
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i].length()>longest.length()) {
				longest=ar[i];
			}
		}
		System.out.println("longest :"+longest);
	}
}