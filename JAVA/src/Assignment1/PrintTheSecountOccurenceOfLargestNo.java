package Assignment1;

public class PrintTheSecountOccurenceOfLargestNo {
	public static void main(String[] args) {
		int[]a= {2,3,6,7,8,9,2,4,9};int max=a[0];int temp=0;
		boolean b[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{  if(a[i]>max) 
			max=a[i];
		}
		System.out.println(max);
		for(int i=0;i<a.length;i++) {
			if (b[i]==false )
			{ 
				if(a[i]==max) 
				{
					int count=1;
					for(int j=i+1;j<a.length;j++)
					{
						if(a[j]==a[i])
						{
							count++;
							b[j]=true;
							temp=j;
						}
					}
					if (count==2)
						System.out.println("index for 2nd occurance "+temp+"==>"+max);
				}
			}
		}
	}
}
