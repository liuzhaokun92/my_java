/*
 编程题（1）  (100 满分)
创建一个简单的表示矩形的Rectangle类，满足以下条件：

 1、定义两个成员变量height和width，表示矩形的长和宽，类型为整型
 2、定义一个getArea方法，返回矩形的面积 
 3、定义一个getPerimeter方法，返回矩形的周长 
 4、在main函数中，利用输入的2个参数分别作为矩形的长和宽，调用getArea和getPermeter方法，计算并返回矩形的面积和周长

输入：
输入2个正整数，中间用空格隔开，分别作为矩形的长和宽，例如：5 8

输出：
输出2个正整数，中间用空格隔开，分别表示矩形的面积和周长，例如：40 26
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
//		System.out.println("输入两个整数，用空格隔开");
		String s;
		String[] s1;
		s=scanner.nextLine();
		s1=s.split(" ");
		a=Integer.parseInt(s1[0]);
		b=Integer.parseInt(s1[1]);
		System.out.println(Rectangle.getArea(a,b)+" "+Rectangle.getPerimeter(a,b));
	}
}
