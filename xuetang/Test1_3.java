/*交集

给定两个数组(数组中不包含相同元素），求两个数组的交集中元素的个数（即共同出现的数，如没有则输出为None） 如输入：
5
1 2 4 6 8
6
1 2 5 6 7 8
输出： 4
*/
package xuetang;
import java.util.*;
public class Test1_3 {
	public static void main(String[] args){
		int a,b,t=0;
		ArrayList a1=new ArrayList();
		ArrayList b1=new ArrayList();
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		for(int i=0;i<a;i++)
		{
			a1.add(scanner.nextInt());
		}
//		System.out.println(a1);
		
		
		b=scanner.nextInt();
		for(int i=0;i<b;i++)
		{
			b1.add(scanner.nextInt());
		}
//		System.out.println(b1);
	
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(a1.get(i)==b1.get(j))
					t++;
			}
		}
		if(t!=0)
			System.out.println(t);
		else
			System.out.println("None");
	}

}
