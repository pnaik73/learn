package Assignment2;

public class SmallestNumberOfArray {

	public static void main(String[] args) {
		int []a= {1,4,5,8,9};
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(smallest);
	}
}
