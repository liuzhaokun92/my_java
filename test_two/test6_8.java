package test_two;
public class test6_8 
{
	public static  void main(String[] args) 
	{
		//6-8
		int a=5,b=8;
		System.out.println("改变之前的数是：a="+a+",b="+b);
		a+=b;
		System.out.println("改变之后的数是：a="+a+",b="+b);
		
		//6-9
		a=10;b=6;
		System.out.println("改变之前的数是：a="+a+",b="+b);
		a-=b++;            //按照从左往右的顺序进行的计算；
		System.out.println("改变之后的数是：a="+a+",b="+b);
	    
		//6-10
		a=12345679;b=9;
		System.out.println("a=12345679;b=9;");
		System.out.println("a*b="+a*b);
		
		//6-11
		a=5;b=4;
		boolean t1=a>b;
		boolean t2=a==b;
		System.out.println("a=5;b=4;");
		System.out.println("a>b:"+t1);
		System.out.println("a==b"+t2);
		
		//6-12
		boolean t=(1+1==2)&&(1+2==3);
		System.out.println("(1+1==2)&&(1+2==3):"+t);
		
		//6-13
		t=(1+1==2)?true:false;
		System.out.println("1+1==2"+t);
		
		//6-14
		int x=12345679,y=81,z;
		z=x*y;
		System.out.println("x*y="+z);
	}

}
