
package test_two;

//9-1
/*
class person
{
	String name;
	int age;
	void talk()
	{
		System.out.println("我是："+name+"，今年"+age+"岁");
	}
}
*/

//9-2
/*
class colordefine
{
	String color="黑色";
	void getMes()
	{
		System.out.println("定义类");
	}
	public static void main(String args[])
	{
		colordefine b=new colordefine();
		System.out.println(b.color);
		b.getMes();
	}
}
*/

//9-3
/*
class TestPersonDemo 
{
	public static  void main(String[] args)
	{
		person p=new person();
		p.name="张三";
		p.age=25;
		p.talk();
		
	}

}
*/

//9-4
/*
public class TestEquals
{
	public static void main(String[] args)
	{
		String str1=new String("java");
		String str2=new String("java");
		String str3=str2;
		if(str1==str2)
		{
			System.out.println("str1==str2");
		}
		else
		{
			System.out.println("str1!=str2");
		}
		if(str2==str3)
		{
			System.out.println("str2==str3");
		}
		else
		{
			System.out.println("str2!=str3");
		}
	}
}
*/

//9-5
/*
public class test
{
	public static void main(String[] args)
	{
		String str1=new String("java");
		String str2=new String("java");
		String str3=str2;
		if(str1.equals(str2))
		{
			System.out.println("str1 equals str2");
		}
		else
		{
			System.out.println("str1 not equals str2");
		}
		if(str2.equals(str3))
		{
			System.out.println("str2 equals str3");
		}
		else
		{
			System.out.println("str2not equals str3");
		}
	}
}
*/

//9-6
/*
class person //这是名为person的类
{
	String name;
	int age;
	//public person(){}
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public String talk()
	{
		return "我是："+this.name+",今年："+this.age+"岁";
	}
}
public class test
{
	public static void main(String[] args)
	{
		person p[]={new person("张三",25),new person("李四",30),new person("王五",35)};
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].talk());
		}
	}
}*/
/*
//9-7
public class test
{
	static String a="string-a";
	static String b;
	String c="string-c";
	String d;
	static
	{
		printStatic("before static");
		b="string-b";
		printStatic("after static");
	}
	public static void printStatic(String title) 
	{
		System.out.println("-------"+title+"-------");
		System.out.println("a=\""+a+"\"");
		System.out.println("b=\""+b+"\"");
	}
	public test()
	{
		print("before constructor");
		d="string-d";
		print("after constructor"); 
	}
	public void print(String title)
	{
		System.out.println("-------"+title+"-------");
		System.out.println("a=\""+a+"\"");
		System.out.println("b=\""+b+"\"");
		System.out.println("c=\""+c+"\"");
		System.out.println("d=\""+d+"\"");
	}
	public static void main(String[] args) 
	{
		new test();
	}
}
*/

/*
//9-8
public class test
{
	int a=12345679,b=81;
	public void times(int i,int j)
	{
		System.out.println(i*j);
	}
	public static void main(String args[])
	{
		test m=new test();
		m.times(m.a, m.b);
	}
}*/

//9-9
/*class person
{
	public person()
	{
		System.out.println("public person()");
	}
}
public class test
{
	public static void main(String[] args)
	{
		person p=new person();
		person w=new person();
	}
}
*/

//9-10
/*
class person
{
	private String name;
	private int age;
	public person(String n,int a)
	{
		name=n;age=a;
		System.out.println("public person(String n,int a)");
	}
	public String talk()
	{
		return "我是："+name+"，今年："+age+"岁";
		
	}
}
public class test
{
	public static void main (String args[])
	{
		person p=new person("zhang san",25);

		System.out.println(p.talk());
		
		person q=new person("lisi ",45);

		System.out.println(q.talk());
	}
}
*/

//9-11-12
/*
class person
{
	private String name;
	private int age;
	public person(){}
	public person(String n,int a)
	{
		name=n;age=a;
		System.out.println("public person(String n,int a)");
		
	}
	public String talk()
	{
		return "我是："+name+",今年："+age+"岁；";
	}
}
public class test
{
	public static void main(String args[])
	{
		person p=new person();/////////////////////////
		System.out.println(p.talk());
	}
}
*/

//9-13
/*public class test
{
	private test()
	{
		System.out.println("private test .");
	}
	public static void main(String args[])
	{
		new test();
		new test();
	}
}
*/

//9-14
/*
class person
{
	String name;
	private static final person p=new person();
	private person()
	{
		name="zhangsan";
	}
	public static person getp()
	{
		return p;
	}
}
public class test
{
	public static void main(String args[])
	{
		person p=null;
		p=person.getp();
		System.out.println(p.name);		
	}
}
*/

//9-15


/*class person1
{
	private String name;
	private int age;
	private void talk()
	{
		System.out.println("我是："+name+",今年："+age+"岁");
	}
	public void say()
	{
		talk();
	}
	public void setname(String str)
	{
		name=str;
	}
	public void setage(int a)
	{
		if(a>0)
			age=a;
	}
	/*public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}   */  /*
}
public class test9
{
	public static void main(String agrs[])
	{
		person1 p=new person1();
		p.setname("zhangsan");
		p.setage(30);
		p.say();
	}
}*/









