package test_two;

////12-39
//class person
//{
//	public void fun1()
//	{
//		System.out.println("1 person{fun1}");
//	}
//	public void fun2()
//	{
//		System.out.println("2 person{fun2}");
//	}
//}
//class student extends person
//{
//	public void fun1()
//	{
//		System.out.println("3 student{fun1}");
//	}
//	public void fun3()
//	{
//		System.out.println("4 student{fun3}");
//	}
//}
//class test12
//{
//	public static void main(String[] args)
//	{
//		person p=new student();
//		if (p instanceof student)
//		{
//			student s=(student)p;
//			s.fun1();
//		}
//		else 
//			p.fun2();
//	}
//}

////12-36//������
//class test12
//{
//	public static void main(String[] args)
//	{
//		final int i=10;
//		i++;
//	}
//}

////12-35
//class person
//{
//	public person()
//	{
//		System.out.println("1.public person()");
//	}
//	static
//	{
//		System.out.println("2.person ��ľ�̬����鱻���ã�");
//	}
//}
//public class test12
//{
//	static
//	{
//		System.out.println("3.test12��ľ�̬����鱻���ã�");
//	}
//	public static void main(String[] args)
//	{
//		System.out.println("��������￪ʼִ��");
//		new person();
//		new person();
//
//	}
//}

////12-34/////////////////////////���������ˣ�������������������������
//public class test12
//{
//	public static void main(String[] args)
//	{
//		int j=args.length;
//		if(j!=2)
//		{
//			System.out.println("������������д���");
//			System.exit(1);
//		}
//		for(int i=0;i<args.length;i++)
//		{
//			System.out.println(args[i]);
//		}
//	}
//}

////12-33
//class person
//{
//	String name;
//	private static String city="�й�";
//	int age;
//	public person(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
//	public String talk()
//	{
//		return "���ǣ�"+this.name+"�����꣺"+this.age+"�꣬���ԣ�"+city;
//	}
//	public static void setcity(String c)
//	{
//		city=c;
//	}
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		person p1=new person("������",23);
//		person p2=new person("������",24);
//		person p3=new person("������",25);
//		System.out.println("�޸�֮ǰ����Ϣ��"+p1.talk());
//		System.out.println("�޸�֮ǰ����Ϣ��"+p2.talk());
//		System.out.println("�޸�֮ǰ����Ϣ��"+p3.talk());
//		System.out.println("***********�޸�֮�����Ϣ**********");
//		person.setcity("����");
//		System.out.println("�޸�֮�����Ϣ��"+p1.talk());
//		System.out.println("�޸�֮�����Ϣ��"+p2.talk());
//		System.out.println("�޸�֮�����Ϣ��"+p3.talk());
//	}
//}


////12-32
//class person
//{
//	String name;
//	static String city="�й�";
//	int age;
//	public person(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
//	public String talk()
//	{
//		return "���ǣ�"+this.name+"�����꣺"+this.age+"�꣬���ԣ�"+city;
//	}
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		person p1=new person("����",23);
//		person p2=new person("����",24);
//		person p3=new person("����",25);
//		System.out.println("�޸�֮ǰ����Ϣ��"+p1.talk());
//		System.out.println("�޸�֮ǰ����Ϣ��"+p2.talk());
//		System.out.println("�޸�֮ǰ����Ϣ��"+p3.talk());
//		System.out.println("***********�޸�֮�����Ϣ**********");
//		p1.city="����";
//		System.out.println("�޸�֮�����Ϣ��"+p1.talk());
//		System.out.println("�޸�֮�����Ϣ��"+p2.talk());
//		System.out.println("�޸�֮�����Ϣ��"+p3.talk());
//	}
//}

////12-31
//class person 
//{
//	String name;
//	String city;
//	int age;
//	public person (String name,String city,int age)
//	{
//		this.name=name;
//		this.city=city;
//		this.age=age;
//	}
//	public String talk()
//	{
//		return "���ǣ�"+this.name+"�����꣺"+this.age+"�꣬���ԣ�"+this.city;
//	}
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		person p1=new person("����","�й�",23);
//		person p2=new person("����","�й�",24);
//		person p3=new person("����","�й�",25);
//		System.out.println(p1.talk());
//		System.out.println(p2.talk());
//		System.out.println(p3.talk());
//	}
//}

////12-30
//class person
//{
//	String name;
//	int age;
//	public person()
//	{
//		System.out.println("1.public person()");
//	}
//	public person(String name,int age)
//	{
//		this();
//		this.name=name;
//		this.age=age;
//		System.out.println("2.public person(String name,int age)");
//	}
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		new person("����",25);
//	}
//}


////12-29\
//class person
//{
//	String name;
//	int age;
//	person(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
//	boolean compare(person p)
//	{
//		if(this.name.equals(p.name)&&this.age==p.age)
//		{
//			return true;
//		}
//		else
//			return false;
//	}
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		person p1=new person("����",23);
//		person p2=new person("����",23);
//		System.out.println(p1.compare(p2)?"��ȣ���ͬһ����":"����ȣ�����ͬһ����");
//	}
//}

////12-28
//class person
//{
//	private String name;
//	private int age;
//	public person(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
//	public String talk()
//	{
//		return "���ǣ�"+name+",���꣺"+age+"��";
//	}
//}
//public class test12
//{
//	public static void main(String[] arge)
//	{
//		person p=new person("����",23);
//		System.out.println(p.talk());
//	}
//}

////12-25
//interface usb
//{
//	public void  start();
//	public void stop();
//}
//class movedisk implements usb
//{
//	public void start()
//	{
//		System.out.println("movedisk start()");
//	}
//	public void stop()
//	{
//		System.out.println("movedisk stop()");
//	}
//}
//class mp3 implements usb
//{
//	public void start()
//	{
//		System.out.println("mp3 start()");
//	}
//	public void stop()
//	{
//		System.out.println("mp3 stop()");
//	}
//}
//class computer
//{
//	public void work(usb u)
//	{
//		u.start();
//		u.stop();
//	}
//}
//class test12
//{
//	public static void main(String[] args)
//	{
//		new computer().work(new movedisk());
//		new computer().work(new mp3());
//	}
//}

////12-24
//interface person
//{
//	public void fun1();
//}
//class student implements person
//{
//	public void fun1()
//	{
//		System.out.println("student fun1()");
//	}
//}
//class test12
//{
//	public static void main(String[] args)
//	{
//		person p=new student();
//		p.fun1();
//	}
//}

////12-23
//class person
//{
//	private String name;
//	private int age;
//	public person(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
//	public boolean equals(Object o)
//	{
//		boolean temp=true;
//		person p1=this;
//		if(o instanceof person)
//		{
//			person p2=(person)o;
//			if(!(p1.name.equals(p2.name)&&p1.age==p2.age))
//			{
//				temp=false;
//			}
//		}
//		else 
//			temp=false;
//		return temp;
//	}
//}
//class test12
//{
//	public static void main(String[] args)
//	{
//		person t_p1=new person("����",23);
//		person t_p2=new person("����",23);
//		System.out.println(t_p1.equals(t_p2)?"��ͬһ����":"����ͬһ����");
//	}
//}

////12-22
//class person
//{
//	private String name;
//	private int age;
//	public person(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
//}
//class test12
//{
//	public static void main(String[] agrs)
//	{
//		person p1=new person("����",23);
//		person p2=new person("����",23);
//		System.out.println(p1.equals(p2)?"��ͬһ����":"�ǲ�ͬ����");
//	}
//}

////12-21
//class change
//{
//	int x=0;
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		change c=new change();
//		c.x=20;
//		fun(c);   //fun()�������յ���һ����������ã����ԣ���fun�������Ĳ����ͻ�Ӱ��ԭ�еĲ���
//		System.out.println("x= "+c.x);
//	}
//	public static void fun(change c1)
//	{
//		c1.x=25;
//	}
//}

////12-20
//class person
//{
//	String name;
//	int age;
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		person p1=null;       //��ʾ����û��ʵ����
//		person p2=null;
//		p1=new person();
//		p2=new person();
//		p1.name="����";
//		p1.age=25;
//		p2=p1;                //��p1�����ø�ֵ����p2
//		System.out.println("������"+p2.name);
//		System.out.println("���䣺"+p2.age);
//		p1=null;
//	}
//}

////12-19
//public class test12
//{                    //����һ����ά�����ʵ�ֹ���
//	public static void main(String[] args)
//	{
//		int A[][]={{12,23,34,82,14},{72,64,19,31}};
//		int B[][]=new int[2][5];
//		B=add10(A);
//		for(int i=0;i<B.length;i++)
//		{
//			for(int j=0;j<B[i].length;j++)
//				System.out.print(B[i][j]+" ");
//			System.out.print("\n");
//		}	
//	}
//	public static int[][] add10(int arr[][])   //�˴���Ҫ�ڷ���ǰ������int[][]�Ķ�ά����
//	{
//		for(int i=0;i<arr.length ;i++)
//			for(int j=0;j<arr[i].length;j++)
//				arr[i][j]+=10;
//		return arr;
//	}			
//}

////12-18
//public class test12
//{
//	public static void main(String[] args)
//	{                           //����ά������Ϊ�������ݵ�������
//		int A[][]={{51,38,26,12,35},{23,67,34,42},{12,23,76,34,0,45}};
//		print_mat(A);
//	}
//	public static void print_mat(int a[][])
//	{
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//				System.out.print(a[i][j]+" ");
//			System.out.println("\n");
//		}
//	}
//}

////12-17
//public class test12
//{
//	public static void main(String[] args)
//	{
//		int score[]={7,3,28,19,6,22};
//		largest(score);         //�����鴫�ݵ������� 
//	}
//	public static void largest(int arr[])//�ڷ������������������������
//	{
//		int tmp=arr[0];
//		for(int i=0;i<arr.length;i++)
//			if(tmp<arr[i])
//				tmp=arr[i];
//		System.out.println("�����������ǣ�"+tmp);
//	}
//}

////12-16
//public class test12
//{
//	public static void main(String[] args)//����add��������3�Σ�ÿ�ζ����¶����˲�������������
//	{
//		int int_sum;
//		double double_sum;
//		int_sum=add(3,5);
//		System.out.println("int_sum=add(3,5)��ֵ�ǣ�"+int_sum);
//		int_sum=add(3,5,6);
//		System.out.println("int_sum=add(3,5,6)��ֵ�ǣ�"+int_sum);
//		double_sum=add(3.2,5.6);
//		System.out.println("double_sum=add(3,2,5,6)��ֵ�ǣ�"+double_sum);
//	}
//	public static int add(int n,int m)
//	{
//		return (n+m);
//	}
//	public static int add(int x,int y,int z)
//	{
//		return (x+y+z);
//	}
//	public static double add(double n,double m)
//	{
//		return(n+m);
//	}
//}

//12-15
//public class test12
//{
//	public static void main(String[] args)
//	{
//		double num;
//		num=show_length(22,19);
//		System.out.println("�Խ��߳����ǣ�"+num);
//	}
//	public static double show_length(int n,int m)//ָ����double����
//	{
//		return Math.sqrt (n*n+m*m);
//	}
//	
//}

////package binarySort;
//public class test12 {
// public static void binary_sort(int a[])
// {
//  int i,j,temp;
//  int low ,hight ,mid;
//  for(i=1;i<a.length;i++)
//  {
//   temp = a[i];
//   low = 0;
//   hight = i-1;
//   while(low<=hight)
//   {
//    mid = (low+hight)/2;
//    if(a[mid]>temp)
//     hight =mid -1;
//    else
//     low = mid + 1;
//   }
//   for(j =i-1;j>hight;j--)
//    a[j+1] = a[j];
//   a[hight+1] = temp;
//  }
// }
// public static void main(String[] args) {
//  int a[] = {2,6,9,8,4,7,3,1,0,5};
//  binary_sort(a);
//  for(int i=0;i<a.length;i++)
//   System.out.print(a[i]+ " ");
// }
//}

		////12-14
		//public class test12
		//{
		//	public static void main(String[] args)
		//	{
		//		int num;
		//		num=star(7);
		//		System.out.println(num+"stars printed");
		//	}
		//	public static int star(int n)
		//	{
		//		for(int i=1;i<=2*n;i++)
		//			System.out.print("*");
		//		System.out.print("\n");
		//		return 2*n;
		//	}
		//}

////12-13
	//public class test12
	//{
	//	public static void main(String[] args)
	//	{
	//		star();
	//		System.out.println("i like java!");
	//		star();
	//	}
	//	public static void star()
	//	{
	//		for(int i=0;i<19;i++)
	//			System.out.print("*");
	//		System.out.print("\n");
	//	}
	//}

//12-12
//class person
//{
//	private String name="����";
//	private int age=25;
//	public String talk()
//	{
//		return "���ǣ�"+name+"�����꣺"+age+"��";
//	}
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		System.out.println(new person().talk());
//	}//��new person()�����Ķ���û�и����κ�һ��person���������ã����Դ˶���ֻʹ����һ�Σ�
//}֮��ͱ�Java�������ռ���������

////12-11
		//interface A
		//{
		//	public void fun1();
		//}
		//class B
		//{
		//	int i=10;
		//	public void get(A a)
		//	{
		//		a.fun1();
		//	}
		//	public void test()
		//	{
		//		this.get(new A()
		//		{                //������Ҫ�����Ǵ���һ��A����������֮��ʵ��A�ӿ����fun1����
		//			public void fun1()
		//			{
		//				System.out.println(i);
		//			}
		//		}
		//		);
		//	}
		//}
		//class test12
		//{
		//	public static void main(String[] args)
		//	{
		//		B b=new B();
		//		b.test();
		//	}
		//}

////12-10
	//interface A
	//{
	//	public void fun1();
	//}
	//class B
	//{
	//	int i=10;
	//	class C implements A
	//	{
	//		public void fun1()
	//		{
	//			System.out.println(i);
	//		}
	//	}
	//	public void get(A a)
	//	{
	//		a.fun1();
	//	}
	//	public void test()
	//	{
	//		this.get(new C());
	//	}
	//}
	//class test12
	//{
	//	public static void main(String[] args)
	//	{
	//		B b=new B();
	//		b.test();
	//	}
	//}
////12-8-9
//class outer
//{
//	int score=95;
//	void inst(final int s)
//	{
//		final int temp=20;
//		class inner
//		{
//			void display()
//			{
//				System.out.println("�ɼ���score="+(score+s+temp));   
//				   //��������������5+95+20
//			}
//		}
//		inner in=new inner();
//		in.display();
//	}
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		outer out=new outer();
//		out.inst(5);
//	}
//}

		//		//12-7
		//		class outer
		//		{
		//			int score=95;
		//			void inst()    //�ڷ����ж����ڲ���
		//			{
		//				class inner
		//				{
		//					void display()
		//					{
		//						System.out.println("�ɼ���score="+score);
		//					}
		//				}
		//				inner in=new inner();
		//				in.display();
		//			}
		//		}
		//		public class test12
		//		{
		//			public static void main(String[] args)
		//			{
		//				outer out=new outer();
		//				out.inst();
		//			}
		//		}

	//		//12-6
	//		class outer
	//		{
	//			int score=95;
	//			void inst()
	//			{
	//				inner in=new inner();
	//				in.display();
	//			}
	//			public class inner
	//			{
	//				void display()
	//				{
	//					System.out.println("�ɼ���score="+score);
	//				}
	//			}
	//		}
	//		public class test12
	//		{
	//			public static void main(String[] args)
	//			{
	//				outer out=new outer();
	//				outer.inner inn=out.new inner();
	//				inn.display();
	//			}
	//		}

//		//12-5
//		class outer
//		{
//			int score=95;     //�˴���Ҫ�ĳ�:static int score=95;
//			void inst()
//			{
//				inner in=new inner();
//				in.display();
//			}
//			static class inner
//			{
//				void display()
//				{
//					System.out.println("�ɼ���score="+score);
//					//��̬���ڲ��಻�ܶ��ⲿ�ķǾ�̬������о�̬����
//		//			��˳��򱨴�
//				}
//			}
//		}
//		public class test12
//		{
//			public static void main(String[] args)
//			{
//				outer outer=new outer();
//				outer.inst();
//			}
//		}


		//	//12-4
		//	class outer
		//	{
		//		int score=95;
		//		void inst()
		//		{
		//			Inner in=new Inner();
		//			in.display();
		//		}
		//		public class Inner
		//		{
		//			void display()
		//			{
		//				String name="����";
		//				System.out.println("�ɼ���score="+score);
		//			}
		//		}
		//		public void print()
		//		{
		//			System.out.println("������"+name);
		//			//�˴���name�޷����ʣ���Ϊname������out���ڲ�����Inner�ж����
		//			//��˴˴������޷�ʵ��
		//		}
		//	}
		//	public class test12
		//	{
		//		public static void main(String[] args)
		//		{
		//			outer outer=new outer();
		//			outer.inst();
		//		}
		//	}
		//	

	////12-3
	//class Outer
	//{
	//	int score=95;
	//	void inst()
	//	{
	//		Inner in=new Inner();
	//		in.display();
	//	}
	//
	//	class Inner
	//	{
	//		void display()
	//		{
	//			System.out.println("�ɼ���score="+score);
	//		}
	//	}
	//}
	//public class test12
	//{
	//	public static void main(String[] args)
	//	{
	//		Outer outer=new Outer();
	//		outer.inst();
	//	}
	//}



////12-1-2
//class person extends Object
//{
//	String name="����";
//	int age=25;
//	
//	public String toString()
//	{
//		return "���ǣ�"+this.name+"�����꣺"+this.age+"��";
//	}
//}
//class test12
//{
//	public static void main(String[] agrs)
//	{
//		person p=new person();
//		System.out.println(p);
//	}
//}

