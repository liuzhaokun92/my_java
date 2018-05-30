/*字符串排序
用Java编写一个能对一组字符串按字典序升序排序的程序
输入为N和N行字符串，需要按行输出字符串升序排序的结果 
如输入
3
Abc
Abe
Abd
输出：
Abc
Abd
Abe
*/
package xuetang;
import java.util.*;
public class Test1_1
{
	public static void main(String[] args)
	{
		
		int i;
		System.out.print("请输入要输入的个数:");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextInt();
		System.out.println("请输入"+i+"个字符串");
		
		ArrayList a=new ArrayList();
		for(int j=0;j<i;j++)
		{
			a.add(scanner.next());
		}

		String a1[]=(String[])a.toArray(new String[i]);	//3->i
		Arrays.sort(a1);
		for(int j=0;j<i;j++)
		{		
			System.out.println(a1[j]);
		}
		
	}
}

