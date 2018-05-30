package test_two;
/*
class person
{
	public void fun1()
	{
		System.out.println("1.person{fun1()}");
	}
	public void fun2()
	{
		System.out.println("2.person{fun2()}");
	}
}
class student extends person
{
	public void fun1()
	{
		System.out.println("3.student{fun3()}");
	}
	public void fun3()
	{
		System.out.println("4.student{fun3()}");
	}
}
class test10
{
	public static void main(String[] args)
	{
		person p=new student();
		student s=(student)p;
		p.fun1();
		p.fun2();
		
		
	}
}
/*
//10-12
class person
{
	public void fun1()
	{
		System.out.println("1.person{fun1()}");
	}
	public void fun2()
	{
		System.out.println("2.person{fun2()}");
	}
}
class student extends person
{
	public void fun1()
	{
		System.out.println("3.person{fun3()}");
	}
	public void fun3()
	{
		System.out.println("4.person{fun3()}");
	}
}
class test10
{
	public static void main(String[] args)
	{
		person p=new student();
		student s=new student();
		p.fun1();
		p.fun2();
		s.fun1();
		s.fun2();
		s.fun3();
		
	}
}

/*
//10-10-11
class person
{
	String name;
	int age;
	public String talk()
	{
		return "我是："+this.name+"，今年"+this.age+"岁";
	}
}

class student extends person
{
	String school;
	public student(String name,int age,String school)
	{
		this.name=name;
		this.age=age;
		this.school=school;
	}
	public String talk()
	{
		return  super.talk()+",我在"+this.school+"上学";
	}
}
class test10
{
	public static void main(String args[])
	{
		student s=new student("张三",25,"北京");
		System.out.println(s.talk());
	}
}


/*
//10-9
class person
{
	private String name;
	private int age;
}
class student extends person
{
	public void setvar()
	{
		name="张三";
		age=25;	
	}
}
class test10
{
	public static void main(String[] args)
	{
		new student().setvar();
	}
}

//10-8
/*
class person
{
	String name;
	int age;
	public person()
	{}
	public String talk()
	{
		return"我是："+this.name+"，今年："+this.age+"岁";
	}
}
class student extends person
{
	String school;
	public student(String name,int age,String school)
	{
		super.name=name;
		super.age=age;
		System.out.print(super.talk());
		this.school=school;
	}
}
public class test10
{
	public static void main(String[] args)
	{
		student s=new student("张三",23,"北京");
		System.out.println(",学校:"+s.school);		
	}
}

//10-7
/*
class person
{
	String name;
	int age;
	public person(String name,int age)
	{
		this.name=name;
		this.age =age;
	}
}
class student extends person
{
	String school;
	public student()
	{
		super("张三",24);
	}
}
public class test10
{
	public static void main(String[] args)
	{
		student s=new student();
		s.school="beijing";
		System.out.println("姓名："+s.name+",年龄："+s.age+",学校"+s.school);
	}
}

/*10-6
class person
{
	String name;
	int age;
	public person()
	{
		System.out.println("1.public person(){}");
	}
}
class student extends person
{
	String school;
	
	public student()
	{
//		super();
		System.out.println("2.public student(){}");
	}
}
public class test10
{
	public static void main(String args[])
	{
		student s=new student();
		s.name="null";
		s.age=0;
		s.school=null;
	}
}

//10-5
/*class person
{
	String name;
	int age;
}
class Student extends person
{
	String school;
}
public class test10
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.name="zhang san";
		s.age=23;
		s.school="beijing";
		System.out.println("姓名："+s.name+"，年龄："+s.age+"，学校："+s.school);
	}
}



//10-3
/*class person

{
	private String name;
	private int age;
	void talk()
	{
		System.out.println("我是："+name+",今年："+age+"岁");
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
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
}
public class test10 
{
	public static void main(String args[])
	{
		person p=new person();
		p.setname("张三");
		p.setage(20);
		p.talk();
	}
}

*
*
*/