/*
�����ϰ��2  (100 ����)
��дһ���������࣬�ܸ��������3��double�������ݹ��������ζ��󣬶����������췽����

�����3���������㹹�������ε�������ֱ�ӹ��������Ρ�
�������3���������ֵ����0�����Զ����������ֵΪ�ߵĵȱ������Ρ�
������ֵҲ������0����������������߶���ʼ��Ϊ0��

�ٶ���һ��getArea����������������������ε��������������Ϊdouble��

��󣬱�дmain����������getArea���������������ε������

���룺
�����������������м��ÿո���������磺
8.9 6.4 7.2

�����
��������ε���������磺
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
//			System.out.println("������������");
			String s=scanner.nextLine();
			String[] s1;
			s1=s.split(" ");
			a=Double.parseDouble(s1[0]);
			b=Double.parseDouble(s1[1]);
			c=Double.parseDouble(s1[2]);
//			System.out.println(a+"  "+b+"  "+c);
			if ((a<(b+c))&&(a>(b-c))&&(a>0)&&(b>0)&&(c>0))
			{
//				System.out.println("��һ����������Թ���������");
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
//					System.out.println("�ڶ�����������ɵȱ�������");
					System.out.println(sanjiaoxing.dbsjx(a));
				}
					
				else
				{
//					System.out.println("�����������������������");
					System.out.println(sanjiaoxing.ooo(0,0,0));
				}
			}

		}
			
	}
	
}
