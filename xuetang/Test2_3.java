/*
 ����⣨1��  (100 ����)
����һ���򵥵ı�ʾ���ε�Rectangle�࣬��������������

 1������������Ա����height��width����ʾ���εĳ��Ϳ�����Ϊ����
 2������һ��getArea���������ؾ��ε���� 
 3������һ��getPerimeter���������ؾ��ε��ܳ� 
 4����main�����У����������2�������ֱ���Ϊ���εĳ��Ϳ�����getArea��getPermeter���������㲢���ؾ��ε�������ܳ�

���룺
����2�����������м��ÿո�������ֱ���Ϊ���εĳ��Ϳ����磺5 8

�����
���2�����������м��ÿո�������ֱ��ʾ���ε�������ܳ������磺40 26
*/

package xuetang;
import java.util.*;
class Rectangle{
	int height,width;
	public static int getArea(int height,int width){
			return height*width;
	}
	public static int getPerimeter(int height,int width){
		
		return 2*height+2*width; 
	}
	
}

public class Test2_3 {
	
	public static void main(String[] args){
		int a,b;
		Scanner scanner=new Scanner(System.in);
//		System.out.println("���������������ÿո����");
		String s;
		String[] s1;
		s=scanner.nextLine();
		s1=s.split(" ");
		a=Integer.parseInt(s1[0]);
		b=Integer.parseInt(s1[1]);
		System.out.println(Rectangle.getArea(a,b)+" "+Rectangle.getPerimeter(a,b));
	}
}
