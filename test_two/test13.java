package test_two;

////13����ϰ��
//public class test13
//{
//	public static void main(String[] args)
//	{
//		Runtime run=Runtime.getRuntime();
//		try
//		{
//			run.exec("calc.exe");
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//}

////13-8
//class Employee implements Cloneable
//{
//	private String name;
//	private int age;
//	public Employee(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
//	public Object clone()throws CloneNotSupportedException
//	{
//		return super.clone();
//	}
//	public String toString()
//	{
//		return "������"+this.name+"�����䣺"+this.age ;
//	}
//	public int getAge()
//	{
//		return age;
//	}
//	public void setAge(int age)
//	{
//		this.age=age;
//	}
//	public String getName()
//	{
//		return name;
//	}
//	public void setName(String name)
//	{
//		this.name=name;
//	}
//}
//public class test13
//{
//	public static void main(String[] args)
//	{
//		Employee e1=new Employee("����",21);
//		Employee e2=null;
//		try
//		{
//			e2=(Employee)e1.clone();
//		}
//		catch(CloneNotSupportedException e)
//		{
//			e.printStackTrace();
//		}
//		e2.setName("����");
//		e2.setAge(30);
//		System.out.println("����������ڴ��ַ�Ƚϣ�"+(e2==e1));
//		System.out.println(e1);
//		System.out.println(e2);
//	}
//}

////13-7
//import java.util.*;
//class person
//{
//	private String name;
//	private int age;
//	person (String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
//	public String toString()
//	{
//		return "������"+this.name+"������"+this.age ;
//	}
//	public boolean equals(Object obj)
//	{
//		return true;
//	}
//	public int hashCode()
//	{
//		return 20;
//	}
//}
//public class test13
//{
//	public static void main(String[] args)
//	{
//		HashMap hm=new HashMap();
//		hm.put(new person("����",23),"����");
//		System.out.println(hm.get(new person("����",20)));
//	}
//}

////13-6
////����5���������
//import java.util.Random;
//public class test13
//{
//	public static void main(String[] args)
//	{
//		Random r=new Random();
//		for(int i=0;i<5;i++)
//			System.out.print(r.nextInt(100)+"\t");
//	}
//}

////13-5
////���������ַ���
//import java.text.*;
//import java.util.Date;
//public class test13
//{
//	public static void main(String[] args)
//	{
//		SimpleDateFormat sp1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		SimpleDateFormat sp2=new SimpleDateFormat("yyyy��MM��dd��hhʱmm��ss��");
//		try
//		{
//			Date d=sp1.parse("2016-10-07 10:10:10");
//			System.out.println(sp2.format(d));
//		}
//		catch(ParseException e)
//		{
//			e.printStackTrace();
//		}
//	}
//}

////13-4
////�����ӡ�����230������ʱ��
//import java.util.*;
//public class test13
//{
//	public static void main(String[] args)
//	{
//		Calendar c1=Calendar.getInstance();
//		System.out.println(c1.get(c1.YEAR)+"��"+(c1.get(c1.MONTH)+1)+"��"+c1.get(c1.DAY_OF_MONTH)+"��"+c1.get(c1.HOUR)+":"+c1.get(c1.MINUTE)+":"+c1.get(c1.SECOND));
//		c1.add(c1.DAY_OF_YEAR,230);
//		System.out.println(c1.get(c1.YEAR)+"��"+(c1.get(c1.MONTH)+1)+"��"+c1.get(c1.DAY_OF_MONTH)+"��"+c1.get(c1.HOUR)+":"+c1.get(c1.MINUTE)+":"+c1.get(c1.SECOND));
//	
//	}
//}

////13-3
////�򿪼��±�����
//public class test13
//{
//	public static void main(String[] args)
//	{
//		Runtime run=Runtime.getRuntime();
//		try
//		{
//			run.exec("notepad.exe");
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//}


////13-2
////��ӡ��ǰ����������л������Եı�����ֵ
//import java.util.*;
//public class test13
//{
//	public static void main(String[] args)
//	{
//		Properties sp=System.getProperties();
//		Enumeration e=sp.propertyNames();
//		while (e.hasMoreElements())
//		{
//			String key=(String)e.nextElement();
//			System.out.println(key+"="+sp.getProperty(key));
//		}
//	}
//}

////13-1
//class test13 
//{
//	public static void main(String[] args)
//	{
//		String x="123";
//		int i=Integer.parseInt(x);
//		i++;
//		System.out.println(i);
//	}
//}
