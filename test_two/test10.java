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
		return "���ǣ�"+this.name+"������"+this.age+"��";
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
		return  super.talk()+",����"+this.school+"��ѧ";
	}
}
class test10
{
	public static void main(String args[])
	{
		student s=new student("����",25,"����");
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
		name="����";
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
		return"���ǣ�"+this.name+"�����꣺"+this.age+"��";
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
		student s=new student("����",23,"����");
		System.out.println(",ѧУ:"+s.school);		
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
		super("����",24);
	}
}
public class test10
{
	public static void main(String[] args)
	{
		student s=new student();
		s.school="beijing";
		System.out.println("������"+s.name+",���䣺"+s.age+",ѧУ"+s.school);
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
		System.out.println("������"+s.name+"�����䣺"+s.age+"��ѧУ��"+s.school);
	}
}



//10-3
/*class person

{
	private String name;
	private int age;
	void talk()
	{
		System.out.println("���ǣ�"+name+",���꣺"+age+"��");
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
		p.setname("����");
		p.setage(20);
		p.talk();
	}
}

*
*
*/