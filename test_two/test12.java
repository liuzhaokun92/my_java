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

////12-36//错误反例
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
//		System.out.println("2.person 类的静态代码块被调用！");
//	}
//}
//public class test12
//{
//	static
//	{
//		System.out.println("3.test12类的静态代码块被调用！");
//	}
//	public static void main(String[] args)
//	{
//		System.out.println("程序从这里开始执行");
//		new person();
//		new person();
//
//	}
//}

////12-34/////////////////////////看不明白了？？？？？？？？？？？？？
//public class test12
//{
//	public static void main(String[] args)
//	{
//		int j=args.length;
//		if(j!=2)
//		{
//			System.out.println("输出参数个数有错误！");
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
//	private static String city="中国";
//	int age;
//	public person(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
//	public String talk()
//	{
//		return "我是："+this.name+"，今年："+this.age+"岁，来自："+city;
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
//		person p1=new person("张三三",23);
//		person p2=new person("李四四",24);
//		person p3=new person("王五五",25);
//		System.out.println("修改之前的信息："+p1.talk());
//		System.out.println("修改之前的信息："+p2.talk());
//		System.out.println("修改之前的信息："+p3.talk());
//		System.out.println("***********修改之后的信息**********");
//		person.setcity("美国");
//		System.out.println("修改之后的信息："+p1.talk());
//		System.out.println("修改之后的信息："+p2.talk());
//		System.out.println("修改之后的信息："+p3.talk());
//	}
//}


////12-32
//class person
//{
//	String name;
//	static String city="中国";
//	int age;
//	public person(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
//	public String talk()
//	{
//		return "我是："+this.name+"，今年："+this.age+"岁，来自："+city;
//	}
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		person p1=new person("张三",23);
//		person p2=new person("李四",24);
//		person p3=new person("王五",25);
//		System.out.println("修改之前的信息："+p1.talk());
//		System.out.println("修改之前的信息："+p2.talk());
//		System.out.println("修改之前的信息："+p3.talk());
//		System.out.println("***********修改之后的信息**********");
//		p1.city="美国";
//		System.out.println("修改之后的信息："+p1.talk());
//		System.out.println("修改之后的信息："+p2.talk());
//		System.out.println("修改之后的信息："+p3.talk());
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
//		return "我是："+this.name+"，今年："+this.age+"岁，来自："+this.city;
//	}
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		person p1=new person("张三","中国",23);
//		person p2=new person("李四","中国",24);
//		person p3=new person("王五","中国",25);
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
//		new person("张三",25);
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
//		person p1=new person("张三",23);
//		person p2=new person("张三",23);
//		System.out.println(p1.compare(p2)?"相等，是同一个人":"不相等，不是同一个人");
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
//		return "我是："+name+",今年："+age+"岁";
//	}
//}
//public class test12
//{
//	public static void main(String[] arge)
//	{
//		person p=new person("张三",23);
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
//		person t_p1=new person("张三",23);
//		person t_p2=new person("张三",23);
//		System.out.println(t_p1.equals(t_p2)?"是同一个人":"不是同一个人");
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
//		person p1=new person("张三",23);
//		person p2=new person("张三",23);
//		System.out.println(p1.equals(p2)?"是同一个人":"是不同的人");
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
//		fun(c);   //fun()方法接收的是一个对象的引用，所以，在fun中所作的操作就会影响原有的参数
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
//		person p1=null;       //表示对象没有实例化
//		person p2=null;
//		p1=new person();
//		p2=new person();
//		p1.name="张三";
//		p1.age=25;
//		p2=p1;                //将p1的引用赋值给了p2
//		System.out.println("姓名："+p2.name);
//		System.out.println("年龄："+p2.age);
//		p1=null;
//	}
//}

////12-19
//public class test12
//{                    //返回一个二维数组的实现过程
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
//	public static int[][] add10(int arr[][])   //此处需要在方法前声明是int[][]的二维数组
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
//	{                           //将二维数组作为参数传递到方法中
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
//		largest(score);         //将数组传递到方法里 
//	}
//	public static void largest(int arr[])//在方法中声明传入的是数组类型
//	{
//		int tmp=arr[0];
//		for(int i=0;i<arr.length;i++)
//			if(tmp<arr[i])
//				tmp=arr[i];
//		System.out.println("数组中最大的是："+tmp);
//	}
//}

////12-16
//public class test12
//{
//	public static void main(String[] args)//方法add被重载了3次，每次都重新定义了参数和数据类型
//	{
//		int int_sum;
//		double double_sum;
//		int_sum=add(3,5);
//		System.out.println("int_sum=add(3,5)的值是："+int_sum);
//		int_sum=add(3,5,6);
//		System.out.println("int_sum=add(3,5,6)的值是："+int_sum);
//		double_sum=add(3.2,5.6);
//		System.out.println("double_sum=add(3,2,5,6)的值是："+double_sum);
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
//		System.out.println("对角线长度是："+num);
//	}
//	public static double show_length(int n,int m)//指明是double类型
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
//	private String name="张三";
//	private int age=25;
//	public String talk()
//	{
//		return "我是："+name+"，今年："+age+"岁";
//	}
//}
//public class test12
//{
//	public static void main(String[] args)
//	{
//		System.out.println(new person().talk());
//	}//用new person()声明的对象并没有赋给任何一个person类对象的引用，所以此对象只使用了一次，
//}之后就被Java的垃圾收集器回收了

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
		//		{                //它的主要作用是传递一个A的匿名对象，之后实现A接口里的fun1方法
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
//				System.out.println("成绩：score="+(score+s+temp));   
//				   //输出是三个数相加5+95+20
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
		//			void inst()    //在方法中定义内部类
		//			{
		//				class inner
		//				{
		//					void display()
		//					{
		//						System.out.println("成绩：score="+score);
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
	//					System.out.println("成绩：score="+score);
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
//			int score=95;     //此处需要改成:static int score=95;
//			void inst()
//			{
//				inner in=new inner();
//				in.display();
//			}
//			static class inner
//			{
//				void display()
//				{
//					System.out.println("成绩：score="+score);
//					//静态的内部类不能对外部的非静态对象进行静态引用
//		//			因此程序报错
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
		//				String name="张三";
		//				System.out.println("成绩：score="+score);
		//			}
		//		}
		//		public void print()
		//		{
		//			System.out.println("姓名："+name);
		//			//此处的name无法访问，因为name是在类out的内部的类Inner中定义的
		//			//因此此处错误无法实现
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
	//			System.out.println("成绩：score="+score);
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
//	String name="张三";
//	int age=25;
//	
//	public String toString()
//	{
//		return "我是："+this.name+"，今年："+this.age+"岁";
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

