package test_two;
import java.util.Arrays;


public class test8 
{
	public static void main(String[] args)
	{
		int i,j,k;
		int a[]={25,24,12,76,98,101,90,28};
		System.out.print("数组a[]=");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		//*********排序方式1
		
		//Arrays.sort(a);
		
		//*********排序方式2
		
		for(i=0;i<a.length;i++)
			for(j=0;j<i;j++)
			{
				if(a[i]<a[j])
				{
					k=a[i];a[i]=a[j];a[j]=k;
				}
			}
		
		
		System.out.print("\n数组a[]=");
		for(i=0;i<a.length;i++)	
			System.out.print(a[i]+" ");
	}

}
