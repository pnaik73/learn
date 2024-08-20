package Assignment1;

public class LargestNSmallestInArray {

	public static void main(String[] args) {
    int []a= {1,2,3,9,0};
    int largest=a[0];
    int smallest=a[0];
    for(int i=0;i<a.length;i++) {
    	for(int j=1;j<a.length;j++) {
    	if(a[j]>a[i]) {
    		largest =a[j];
    	}
    	else {
    		smallest=a[j];
    	}
    }
    }	
    System.out.println("Largest: "+largest);
    System.out.println("Smallest: "+smallest);
	}
}
