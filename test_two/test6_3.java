package test_two;

public class test6_3 {
	public static void main(String[] args)
	{
		//6-3
		int a=3;
		int b=4;
		
		System.out.println("a="+a+",b="+b);
		System.out.println("a/b="+(a/b));
		System.out.println("a/b="+((float)a/b)+"\n" );
		
		//6-4
		int c=5;
		int d=3;
		System.out.println(c+"%"+d+"="+c%d);
		System.out.println(d+"%"+c+"="+d%c+"\n");
		
		//6-5
		if(5>2)
			System.out.println("6-5\n����ֵ��"+(5>2));
		if(true)
			System.out.println("hello java��\n\n");
		if((3+5)==(3-5))                             //û�õ�һ�����
			System.out.println("i like java!");      //û�õ�һ�����
		
		//6-6		
		System.out.println("6-6:����a++��++a");
		int e=3,f=3;
		System.out.print("a="+a);
		System.out.println(",a++="+(a++)+",a="+a);
		System.out.print("b="+b);
		System.out.println(",++b="+(++b)+",b="+b+"\n");
		
		//6-7
		System.out.print("6-7:��||����&&\n");
		int g=56;
		if((g<0)||(g>100))
			System.out.print("������������");
		if((g<60)&&(g>45))
			System.out.print("׼��������");		
		
	}

}
