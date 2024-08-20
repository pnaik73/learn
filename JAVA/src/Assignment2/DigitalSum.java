package Assignment2;

public class DigitalSum {

	public static void main(String[] args) {
		int i = 123;int temp=i;int sum=0;
		while(i>0) {
		int	rem=i%10;
		sum=rem+sum;
		i=i/10;
		}
		System.out.println(sum);
	}
}
