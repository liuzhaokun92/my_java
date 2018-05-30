package test_two;
public class test7_1 
{
	public static void main(String[] args)
	{
		//7-1;
		int a=6,b=5;
		System.out.println("a="+a+",b="+b);
		if(a>b)
			System.out.println("a-b="+(a-b));
		System.out.println("a*b="+a*b);
		
		//7-2;
		a=5;
		if(a%2==1)
			System.out.println(a+"是奇数！");
		else
			System.out.println(a+"是偶数！");
		
		//7-3
		int x=3;
		if(x==1)
			System.out.println("x==1");
		else if(x==2)
			System.out.println("x==2");
		else if(x==3)
			System.out.println("x==3");
		else
			System.out.println("x>3");
		
		//7-4
		int max;
		a=5;b=13;
		max=(a>b)?a:b;         //***************
		System.out.println("a="+a+",b="+b);
		System.out.println("最大的数是"+max);
		
		//7-5
		a=100;b=7;
		char oper='/';
		switch(oper)
		{
		case'+':
			System.out.println(a+"+"+b+"="+(a+b));break;
		case'-':
			System.out.println(a+"-"+b+"="+(a-b));break;
		case'*':
			System.out.println(a+"*"+b+"="+(a*b));break;
		case'/':
			System.out.println(a+"/"+b+"="+((float)a/b));break;
		default:
			System.out.println("未知的操作！");
		}	
		
		//7-6
		int i=1,sum=0;
		while(i<=10)
		{
			sum+=i;
			i++;
		}
		System.out.println("1+2+3...+10="+sum);
		
		//7-7
		i=0;sum=0;
		do
		{
			sum=sum+i;
			i++;
		}while(i<=100);
		System.out.println("1+2+3...+100="+sum);
		
		//7-8
		i=1;sum=0;
		for(i=1;i<=1000;i++)
			sum+=i;
		System.out.println("1+2+3...+1000="+sum);
		
		//7-9
		int j;
		i=1;j=1;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");	
			}
			System.out.println("\n");
		}
		
		//7-10
		for(i=1;i<=10;i++)
		{
			if(i%7==0)
				break;
			System.out.println("i="+i);
		}
		System.out.println("循环中断i="+i);
		
		
		for(i=1;i<=10;i++)
		{
			if(i%3==0)
			{
				System.out.println("\n");
				continue;
			}
			System.out.println("i="+i);
		}
		System.out.println("循环中断i="+i);

	}

}
