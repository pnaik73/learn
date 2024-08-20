package Assignment2;
//input:[1,2,0,45,89]
//output: 89

public class LargestOfAnArray {

	public static void main(String[] args) {
		int []a= {1,2,0,45,89,24,99,1,0};int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println(large);
	}
}
