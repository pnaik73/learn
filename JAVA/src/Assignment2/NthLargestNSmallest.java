package Assignment2;

//input1: [22,3,1,5,6,8] n: 4th largest    input2: [22,34,7,4,2,11] n:3rd smallest
//output: 5                                output: 7

public class NthLargestNSmallest {

	public static void main(String[] args) {
		int a[]= {22,3,1,5,6,8};int n=1;
		for(int i=0;i<a.length;i++) {
			int largecount=0;int smallerCount=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]>a[i]) {
					largecount++;
				}
				if(a[j]<a[i]) {
					smallerCount++;
				}
			}
			if(largecount==n-1) {
				System.out.println(a[i]);
			}
			if(smallerCount==(a.length-n)) {
				System.out.println(a[i]);
			}
		}
	}
}
