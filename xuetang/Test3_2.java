/*
图形面积计算

我们有一些图形的边长数据，这些图形包括三角新和矩形，请你编写一个程序求出它们的面积。 
请你实现一个基础图形类Graph，然后实现三角形类Triangle和矩形类Rectangle，继承自Graph。
根据输入的边数实现不同的对象，并计算面积。
输入格式：
一行，一个整数n，表示图形个数。
n行，每行是用空格隔开的整数。
输出格式：
n行，每行是一个图形的面积。
输入样例：
2
5 5
6 6 6
输出样例：
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
		System.out.println("输入图形个数");
		num=scanner.nextInt();
		System.out.println("输入边长");
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
					System.out.println("构不成三角形");
					continue;
				}		
			}
			else{
				System.out.println("输入的不是三角形或矩形");
				continue;
			}				
		}
	}
}
