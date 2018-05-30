package xuetang;
///*
//教师学生评分
//
//学校要进行年终总结，需要对教师和学生的评分结果进行统计。学生的统计数据有三个，教师的统计数据有四个。
//请你实现一个统计系统，对输入的数据进行整理。 
//请你实现一个Person类表示人员，并实现一些必要的方法，再实现Teacher类和Student类，通过类的继承机制完成这个任务。
//输入格式：
//首先输入一个数字N，表示输入统计的人数。
//接下来是N行，每行是用空格隔开的一系列数字。
//输出格式：
//N行，每行是一个标识符加一个平均得分（向下取整的整数），用空格隔开。
//学生的标识符是Student，教师的标识符是Teacher。
//输入样例：
//2
//2 3 4
//2 3 4 5
//输出样例：
//Student 3
//Teacher 3
//*/
//package xuetangzaixian;
//import java.util.*;
//class Person{
//	public static int add(int[] p){
//		int add=0;
//		for(int i=0;i<p.length;i++)//求和
//		{
//			add+=p[i];
//		}	
//		return add;
//	}
//}	
//
//class Teacher extends Person{
//	public static int getT(int p)
//	{
//		int ave=0;
//		ave=(int) Math.floor(p/4);//求平均值
//		return ave;
//	}
//}
//class Student extends Person{
//	public static int getS(int p)
//	{
//		int ave=0;
//		ave=(int) Math.floor(p/3);//求平均值
//		return ave;
//	}
//}
//public class Test3_1 {
//	public static void main(String args[]){
//		int num;
////		System.out.print("输入统计人数：");
//		num=new Scanner(System.in).nextInt();
//
//		int a[][] = new int[num][];
////		System.out.print("输入分数：");
//		for(int i=0;i<num;i++)
//		{
//			String p=new Scanner(System.in).nextLine();
//
//			String[] p1=p.split(" ");
//			int[] p2 =  new int[p1.length];
//			for(int j=0;j<p1.length;j++){
//				p2[j]=Integer.parseInt(p1[j]);
//			}
//			a[i]=p2;
//		}
//		for(int i=0;i<num;i++)
//		{
//			if(a[i].length==3){
//				System.out.println("Student"+" "+Student.getS(Student.add(a[i])));
//			}
//			if(a[i].length==4){
//				System.out.println("Teacher"+" "+Teacher.getT(Teacher.add(a[i])));
//			}
//		}
//	}
//}