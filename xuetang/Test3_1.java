package xuetang;
///*
//��ʦѧ������
//
//ѧУҪ���������ܽᣬ��Ҫ�Խ�ʦ��ѧ�������ֽ������ͳ�ơ�ѧ����ͳ����������������ʦ��ͳ���������ĸ���
//����ʵ��һ��ͳ��ϵͳ������������ݽ������� 
//����ʵ��һ��Person���ʾ��Ա����ʵ��һЩ��Ҫ�ķ�������ʵ��Teacher���Student�࣬ͨ����ļ̳л�������������
//�����ʽ��
//��������һ������N����ʾ����ͳ�Ƶ�������
//��������N�У�ÿ�����ÿո������һϵ�����֡�
//�����ʽ��
//N�У�ÿ����һ����ʶ����һ��ƽ���÷֣�����ȡ�������������ÿո������
//ѧ���ı�ʶ����Student����ʦ�ı�ʶ����Teacher��
//����������
//2
//2 3 4
//2 3 4 5
//���������
//Student 3
//Teacher 3
//*/
//package xuetangzaixian;
//import java.util.*;
//class Person{
//	public static int add(int[] p){
//		int add=0;
//		for(int i=0;i<p.length;i++)//���
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
//		ave=(int) Math.floor(p/4);//��ƽ��ֵ
//		return ave;
//	}
//}
//class Student extends Person{
//	public static int getS(int p)
//	{
//		int ave=0;
//		ave=(int) Math.floor(p/3);//��ƽ��ֵ
//		return ave;
//	}
//}
//public class Test3_1 {
//	public static void main(String args[]){
//		int num;
////		System.out.print("����ͳ��������");
//		num=new Scanner(System.in).nextInt();
//
//		int a[][] = new int[num][];
////		System.out.print("���������");
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