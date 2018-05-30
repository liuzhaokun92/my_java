/*
编程练习题2  (100 满分)
编写一个三角形类，能根据输入的3个double类型数据构造三角形对象，定义三个构造方法。

如果这3个数据满足构成三角形的条件，直接构造三角形。
否则，如果3个数的最大值大于0，则自动构造以最大值为边的等边三角形。
如果最大值也不大于0，则将三角形类的三边都初始化为0。

再定义一个getArea方法，计算所构造的三角形的面积，返回类型为double。

最后，编写main方法，测试getArea方法，计算三角形的面积。

输入：
输入三个有理数，中间用空格隔开。例如：
8.9 6.4 7.2

输出：
输出三角形的面积。例如：
22.78812396293297
  
 */
package xuetang;

import java.util.Scanner;

class sanjiaoxing{
	static double x,y,z;
	public static double sjx (double x,double y,double z)
	{
		double a,b,c;
		a=x;
		b=y;
		c=z;
		return getArea(a,b,c);
		
	}
	public static double dbsjx (double x )
	{
		double a,b,c;
		a=x;
		b=x;
		c=x;
		return getArea(a,b,c);
	}
	public static double ooo (double x,double y,double z )
	{
		return 0;
	}
	public static double getArea(double x,double y,double z )
	{ 
		double s,area;
		s=(x+y+z)/2;
		area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
		return area;
	}
}
public class Test2_2 {
	
	public static void main(String[] args){
		for(;;){
			Scanner scanner= new Scanner(System.in);
	
			double a,b,c;
//			System.out.println("输入三个数：");
			String s=scanner.nextLine();
			String[] s1;
			s1=s.split(" ");
			a=Double.parseDouble(s1[0]);
			b=Double.parseDouble(s1[1]);
			c=Double.parseDouble(s1[2]);
//			System.out.println(a+"  "+b+"  "+c);
			if ((a<(b+c))&&(a>(b-c))&&(a>0)&&(b>0)&&(c>0))
			{
//				System.out.println("第一种情况：可以构成三角形");
				System.out.println(sanjiaoxing.sjx(a,b,c));
			}
			else 
			{
				if(a<b)
					a=b;
				if(a<c)
					a=c;
				if(a>0)
				{
//					System.out.println("第二种情况：构成等边三角形");
					System.out.println(sanjiaoxing.dbsjx(a));
				}
					
				else
				{
//					System.out.println("第三种情况：构不成三角形");
					System.out.println(sanjiaoxing.ooo(0,0,0));
				}
			}

		}
			
	}
	
}
