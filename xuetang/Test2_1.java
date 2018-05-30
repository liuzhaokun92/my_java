/*
 * 编写一个表示二维平面上的点的类MyPoint，满足以下条件：
1、定义private的成员变量x和y，表示点的x和y坐标，类型为double
2、定义两个MyPoint的构造方法，一个构造方法不带参数，而且x和y的初始值为0，另一个构造方法有两个参数，参数名为x和y，类型为double，用这两个参数分别作为初始x和y坐标
3、定义一个getD方法，有一个类型为MyPoint的对象参数，功能为返回当前对象和参数对象这两个坐标点的距离，返回值为double类型
4、编写测试的main方法，调用getD计算两个点之间的距离

输入：
输入2行数据， 总共4个有理数。每2个数据一组，表示一个点的x和y坐标，每行的2个数据用空格隔开。例如：
200.1 200.2
200.3 200.4

输出：
输出两个点之间的距离。例如：
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
