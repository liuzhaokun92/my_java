/*
����������

����������һЩ���ݣ����������ַ������ӵġ�������Ҫ�㽫���Ƿֿ������ҷֱ�������� 
�������÷���ʵ��һ�������࣬����ʵ����������ʹ����ȿ��Զ�Integer���ͽ��������ֿ��Զ�String���ͽ�������Ȼ��������ʵ�ֵ������������������
�����ʽ��
һ�У�һ������n����ʾԪ�صĸ�ʽ��
n�У�ÿ��һ���ַ���������Ҳ�����������ַ�����
�����ʽ��
n�У�ǰ��һ����Ϊ����������ַ�������С�����������������һ����Ϊ�������ַ��������ֵ����С���������
����������
5
12
ab
bd
32
t
���������
12
23
ab
bd
t

*/package xuetang;
import java.util.*;
class GeneralMethod<Type>{
	public void sort(GeneralMethod<?> o){	
	}
	
}
public class Test3_3 {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int num;
		System.out.println("�������");
		num=scanner.nextInt();
		System.out.println("����Ҫ��������ݣ�");
		String[][] a=new String[num][];
		for(int i=0;i<num;i++){
			ArrayList s=new ArrayList();
			while(scanner.next()!="\n"){
				s.add(scanner.next());
			}
			String[] str=new String[s.size()];
			s.toArray(str);
			a[i]=str;
		}
	}
}
