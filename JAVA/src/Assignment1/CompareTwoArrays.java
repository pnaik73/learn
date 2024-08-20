package Assignment1;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		int []a= {1,2,3,4};
		int []b= {3,2,1,4,5};
		if(a.length==b.length)	{
			Arrays.sort(a);
			Arrays.sort(b);int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i]) 
				{
					count++;
					break;
				}
			}
			if(count!=1)
			{
				System.out.println("same");
			}
		}
		else {
			System.out.println("not same");
		}
	}
}