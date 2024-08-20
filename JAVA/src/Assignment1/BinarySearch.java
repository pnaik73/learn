package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int []a= {1,9,3,8,4,6,2,5};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the key element");
		int key=s.nextInt();
		int low=0; int high=a.length-1;
		int count=0;
		Arrays.sort(a);
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==a[mid]) {
				count++;
				break;
			}
			else if(key>a[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		if(count==1) {
			System.out.println(key+" is present");
		}
		else {
			System.out.println(key+" is not present");
		}
	}
}


