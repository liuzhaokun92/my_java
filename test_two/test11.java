package test_two;
/*
abstract class person
{
	String name;
	int age;
	String occupation;

	public abstract String talk();
}
class ganbu extends person
{
	public ganbu(String name,int age,String occupation)
	{
		this.name=name;this.age=age;this.occupation=occupation;
	}
	public String talk()
	{
		return "干部——姓名："+this.name+"，年龄："+this.age+"，职业："+this.occupation;
	}
}

class gongren extends person
{
	public gongren(String name,int age,String occupation)
	{
		this.name=name;this.age=age;this.occupation=occupation;
	}
	public String talk()
	{
		return "工人——姓名："+this.name+"，年龄："+this.age+"，职业："+this.occupation;
	}
}

class test11
{
	public static  void main(String[] args)
	{
		ganbu G=new ganbu("李乐乐",20,"干部");
		gongren g=new gongren("王小六",30,"工人");
		System.out.println(G.talk());
		System.out.println(g.talk());
	}
}


/*
//11-4
interface A
{
	int i=10;
	public void sayI();
}
interface E
{
	int x=40;
	public void sayE();
}
interface B extends A,E
{
	int j=20;
	public void sayJ();
}
class C implements B
{
	public void sayI()
	{
		System.out.println("i="+i);
	}
	public void sayJ()
	{
		System.out.println("j="+j);
	}
	public void sayE()
	{
		System.out.println("e="+x);
	}
}
class test11
{
	public static void main(String[] args)
	{
		C c=new C();
		c.sayI();
		c.sayJ();
		//c.sayE();
	}
}
/*
//11-3
interface person
{
	String name="张三";
	int age=25;
	String occupation="学生";
	public abstract String talk();
}
class student implements person
{
	public String talk()
	{
		return"学生——>姓名："+this.name+"，年龄"+this.age+"，职业"+this.occupation;
	}
}
class test11
{
	public static void main(String[] args)
	{
		student s=new student();
		System.out.println(s.talk());
	}
}

/*
//11-2
abstract class person
{
	String name;
	int age;
	String occupation;
	public person(String name,int age,String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public abstract String talk();
}
class student extends person
{
	public student(String name,int age,String occupation)
	{
		super(name,age,occupation);
	}
	public String talk()
	{
		return "学生——>姓名："+this.name+"，年龄："+this.age+"，职业："+this.occupation;
	}
}
class test11
{
	public static void main(String[] args)
	{
		student s=new student("张三",23,"学生");
		System.out.println(s.talk());
	}
}


//11-1
/*
abstract class person
{
	String name;
	int age;
	String occupation;
	public abstract String talk();
}
class student extends person
{
	public student(String name,int age,String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public String talk()
	{
		return "学生——>姓名："+this.name+"，年龄"+this.age+"，职业："+occupation;
	}
}
class worker extends person
{
	public worker (String name,int age,String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public String talk()
	{
		return "工人——>姓名："+this.name+"，年龄"+this.age+"，职业："+this.occupation;
	}
}
class test11
{
	public static void main(String[] args)
	{
		student s=new student("张三",23,"学生");
		worker w=new worker("李四",39,"工人");
		System.out.println(s.talk());
		System.out.println(w.talk());
	}
}*/