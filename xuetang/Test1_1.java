/*�ַ�������
��Java��дһ���ܶ�һ���ַ������ֵ�����������ĳ���
����ΪN��N���ַ�������Ҫ��������ַ�����������Ľ�� 
������
3
Abc
Abe
Abd
�����
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
		System.out.print("������Ҫ����ĸ���:");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextInt();
		System.out.println("������"+i+"���ַ���");
		
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

