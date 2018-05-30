package test_two;
public class test5_1 
{
	public static void main(String args[])
	{
		//5-1
		byte byte_max=Byte.MAX_VALUE;
		System.out.println("BYTE的最大值： "+byte_max );
		
		//5-2
		short short_max=Short.MAX_VALUE;
		System.out.println("SHORT的最大值： "+short_max);
		
		//5-3
		int int_max=java.lang.Integer.MAX_VALUE;
		System.out.println("INT的最大值： "+int_max);
		
		//5-4
		long long_max=java.lang.Long.MAX_VALUE;
		System.out.println("LONG的最大值： "+long_max);
		
		//5-5
		float num=3.0f;
		System.out.println(num+"*"+num+"="+(num*num));
		System.out.println("\n");
		
		//5-6
		System.out.println("float_max="+java.lang.Float.MAX_VALUE);
		System.out.println("Float_min="+java.lang.Float.MIN_VALUE);
		System.out.println("Double_max="+java.lang.Double.MAX_VALUE);
		System.out.println("Double_min="+java.lang.Double.MIN_VALUE);
		System.out.println("\n");
		
		//5-7
		char ch1=97;
		char ch2='a';
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);
		System.out.println("\n");
		
		//5-8
		char ch='\"';
		System.out.println(ch+"测试转义字符!"+ch);
		System.out.println("\"hello world\"");
		System.out.println("\n");
		
		//5-9
		boolean status=true;
		System.out.println("status="+status);
		
		//5-10
		int a=156;
		float b=24.1f;
		
		System.out.println("a="+a+", b="+b);
		System.out.println("a/b="+(a/b));
		System.out.println("\n");
		
		int c=55;
		int d=9;
		float g,h;
		System.out.println("a="+c+", b="+d);
		g=c/d;
		System.out.println("a/b="+g+"\n");
		System.out.println("a="+c+", b="+d);
		h=(float)c/d;
		System.out.println("a/b="+h);
		
	}

}
