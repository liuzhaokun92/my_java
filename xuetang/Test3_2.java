/*
ͼ���������

������һЩͼ�εı߳����ݣ���Щͼ�ΰ��������º;��Σ������дһ������������ǵ������ 
����ʵ��һ������ͼ����Graph��Ȼ��ʵ����������Triangle�;�����Rectangle���̳���Graph��
��������ı���ʵ�ֲ�ͬ�Ķ��󣬲����������
�����ʽ��
һ�У�һ������n����ʾͼ�θ�����
n�У�ÿ�����ÿո������������
�����ʽ��
n�У�ÿ����һ��ͼ�ε������
����������
2
5 5
6 6 6
���������
25
15*/
package xuetang;
import java.util.*;
class Graph{
	public Graph(){
		return;
	}
}
class Triangle extends Graph{
	public static double area(int a,int b,int c)
	{	
		double s,area = 0;
		s=(double)(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
}
class Rect extends Graph{
	public static int area(int x,int y)
	{
		int area=0;
		area=x*y;
		return area;
	}
}
public class Test3_2 {

	public static int[] read(){
		Scanner sca=new Scanner(System.in);
		String s=sca.nextLine();
		String[] str=s.split(" ");
		int[] st = new int[str.length];
		for(int j=0;j<str.length;j++){
			st[j]=Integer.parseInt(str[j]);
		}
		return st;
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int num=0;
		System.out.println("����ͼ�θ���");
		num=scanner.nextInt();
		System.out.println("����߳�");
		int a[][]=new int[num][];
		for(int i=0;i<num;i++){
			a[i]=read();
		}
		for(int i=0;i<num;i++){
			if(a[i].length==2){
				System.out.println(Rect.area(a[i][0],a[i][1]));
			}
			else if(a[i].length==3){
				int x,y,z;
				x=a[i][0];y=a[i][1];z=a[i][2];
				if ((x<(y+z))&&(y<(x+z))&&(z<(x+y))&&(x>0)&&(y>0)&&(z>0)){
					System.out.println(Triangle.area(x,y,z));
				}
				else {
					System.out.println("������������");
					continue;
				}		
			}
			else{
				System.out.println("����Ĳ��������λ����");
				continue;
			}				
		}
	}
}
