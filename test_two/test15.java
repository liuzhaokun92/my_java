package test_two;
////15-练习
//public class test15
//{
//	public static void main(String[] args)
//	{
//		int a=4,b=0;
//		try
//		{
//			if (0==b)
//				throw new ArithmeticException("被除数是0，程序错误！");
//			else
//				System.out.println("a/b="+a/b);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
//	}
//}

//15-6
//class DefaultException extends Exception
//{
//	public DefaultException(String msg)
//	{super(msg);}
//}
//public class test15
//{
//	public static void main(String[] args)
//	{
//		try
//		{
//			throw new DefaultException("自定义异常");
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//	}
//}

//15-5
//class test
//{
//	void add(int a,int b)throws Exception
//	{
//		int c;
//		c=a/b;
//		System.out.println(a+"/"+b+"="+c);
//	}
//}
//public class test15
//{
//	public static void main(String[] args)
//	{
//		test t=new test();
//		t.add(4,0);
//	}
//}

//15--4
//public class test15
//{ 
//	public static void main(String[] args)
//	{
//		int a=4,b=0;
//		try
//		{
//			if (b==0)
//				throw new ArithmeticException("一个算数异常");
//			else
//				System.out.println(a+"/"+b+"="+a/b);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("抛出异常为："+e);
//		}
//	}
//}
//15-2-3
//public class test15
//{
//	public static void main(String[] args)
//	{
//		try
//		{
//			int arr[]=new int[5];
//			arr[10]=7;
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("数组超出绑定范围");
//
//			System.out.println("这里一定会执行！"+e);
//		}
//		System.out.println("main程序到此结束");
//	}
//}
//15-1
//public class test15 {
//
//	public static void main(String[] args){
//		int arr[]=new int[5];
//		arr[10]=7;
//		System.out.println("end of main() method!!");}
//}
