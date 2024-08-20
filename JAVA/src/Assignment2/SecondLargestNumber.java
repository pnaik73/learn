package Assignment2;

public class SecondLargestNumber {

	public static void main(String[] args) {
    int []a= {1,11,44,33,55,66};
    for(int i=0;i<a.length;i++) {
    	int count=0;
    	for(int j=0;j<a.length;j++)
		{
			if(a[j]>a[i])
				count++;
		}
		if(count==1)
			System.out.println(a[i]+" is 2nd largest element");
    }
	}

}
