package test_two;
import java.util.Arrays;

public class test8_1 
{
	public static void main(String args[])
	{
		//8-1
		int i;
		int a[];
		a=new int[3];
		for(i=0;i<3;i++)
		{
			a[i]=i+9;
			System.out.print("a["+i+"]="+a[i]+",\t");
		}
		System.out.println("\n数组的长度是："+a.length);
		
		//8-2
		int aa[]={5,6,8,9};
		for(i=0;i<aa.length;i++)
			System.out.print("aa["+i+"]="+aa[i]+", ");
		System.out.println("\n数组的长度是："+aa.length);
		
		//8-3
		int min,max;
		int A[]={74,48,30,17,62,109};
		
		min=max=A[0];
		System.out.print("\n数组A的元素包括：  ");
		for(i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
			if(A[i]>max)
				max=A[i];
			if(A[i]<min)
				min=A[i];
		}
		System.out.println("\n数组最大的值是："+max);
		System.out.println("数组最小的值是："+min);
		
		//8-4
		int a1[]={1,2,3,4,5},a2[]={11,12,13,14,15,16,17};
		for(i=0;i<a1.length;i++)
			System.out.print(a1[i]+" ");
		System.out.print("\n");
		for(i=0;i<a2.length;i++)
			System.out.print(a2[i]+" ");
		System.out.print("\n");
		
		
		System.arraycopy(a1,1,a2,2,3);   ///***********
		
		
		System.out.print("a1数组中的内容：");
		for(i=0;i<a1.length;i++)
			System.out.print(a1[i]+" ");
		System.out.println();
		System.out.print("a2数组中的内容： ");
		for(i=0;i<a2.length;i++)
			System.out.print(a2[i]+" ");
		System.out.println("\n数组拷贝完成！");
		
		//8-5
		int a3[]={4,32,45,32,65,32,2};
		System.out.print("数组排序前的顺序：");
		for(i=0;i<a3.length;i++)
			System.out.print(a3[i]+" ");
		Arrays.sort(a3);                 ///***********
		System.out.print("\n数组排序后的顺序：");
		for(i=0;i<a3.length;i++)
			System.out.print(a3[i]+" ");
		
		//8-6
		int j,sum=0;
		int num[][]={{30,35,26,32},{33,34,30,29}};
		System.out.println();
		for(i=0;i<num.length;i++)
		{
			System.out.print("第 "+(i+1)+"个人成绩为： ");
			for(j=0;j<num[i].length;j++)
			{
				System.out.print(num[i][j]+" ");
				sum+=num[i][j];
			}
			System.out.println();
		}
		System.out.println("\n 总成绩是 "+sum+"分！");
		
		//8-7
		int k;
		sum=0;
		int AA[][][]={{{5,1},{6,7}},{{9,4},{8,3}}};
		for(i=0;i<AA.length;i++)
			for(j=0;j<AA[i].length;j++)
				for(k=0;k<AA[i][j].length;k++)
				{
					System.out.print("A["+i+"]["+j+"]["+k+"]=");
					System.out.println(AA[i][j][k]);
					sum+=AA[i][j][k];
				}
		System.out.println("sum="+sum);
		
	}

}
