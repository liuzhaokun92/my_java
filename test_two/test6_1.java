package test_two;
public class test6_1 
{
	public static void main(String args[])
	{
		//6-1
		int num=22;
		System.out.println("第一次赋值后，num="+num);
		num=num-3;
		System.out.println("改变之后的值，num="+num);
		
		//6-2
		//  ~  取补码，
		//  ！    NOT 否
		byte a=java.lang.Byte.MAX_VALUE;
		boolean b=false;
		System.out.println("a="+a+",~a="+(~a));
		System.out.println("b="+b+",!b="+(!b));
				
	}

}
