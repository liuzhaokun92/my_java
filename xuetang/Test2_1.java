/*
 * ��дһ����ʾ��άƽ���ϵĵ����MyPoint����������������
1������private�ĳ�Ա����x��y����ʾ���x��y���꣬����Ϊdouble
2����������MyPoint�Ĺ��췽����һ�����췽����������������x��y�ĳ�ʼֵΪ0����һ�����췽��������������������Ϊx��y������Ϊdouble���������������ֱ���Ϊ��ʼx��y����
3������һ��getD��������һ������ΪMyPoint�Ķ������������Ϊ���ص�ǰ����Ͳ������������������ľ��룬����ֵΪdouble����
4����д���Ե�main����������getD����������֮��ľ���

���룺
����2�����ݣ� �ܹ�4����������ÿ2������һ�飬��ʾһ�����x��y���꣬ÿ�е�2�������ÿո���������磺
200.1 200.2
200.3 200.4

�����
���������֮��ľ��롣���磺
0.28284271247464315
*/
package xuetang;
import java.util.*;
class MyPoint{
//	MyPoint MyPoint=new MyPoint();
	private static double x;
	private static double y;
	public void  MyPoint()
	{
		x=0;
		y=0;
	}

	public static double getD(double m,double n)
	{
		double distance,a,b;
		a=m;b=n;
		distance=Math.sqrt((a-x)*(a-x)+(b-y)*(b-y));
		return distance;
		
	}
	public static void MyPoint(double d, double e) {
		x=d;
		y=e;		
	}
}
public class Test2_1 {
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		String a1=scanner.nextLine();
		String b1=scanner.nextLine();
		
		String[] a2=a1.split(" ");
		String[] b2=b1.split(" ");
		double a3[] =new double[2],b3[]=new double[2];
		for(int i=0;i<a2.length;i++)
		{
			a3[i]=Double.parseDouble(a2[i]);
		}
		for(int i=0;i<b2.length;i++)
		{
			b3[i]=Double.parseDouble(b2[i]);
		}
		MyPoint.MyPoint(a3[0],a3[1]);
		System.out.println(MyPoint.getD(b3[0],b3[1]));
	}
}
