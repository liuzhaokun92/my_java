/*求斐波拉契数

斐波拉契数为，Fib(N) = Fib(N-1)+Fib(N-2) F(0)=F(1)=1 
用Java编写能求Fib(N)的程序 输入为N,须输出Fib(N)
如输入
3
输出：
3*/
package xuetang;
import java.util.*;
public class Test1_2 {
	public static void main(String[] args)
	{
		int a;
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println(Fun(a));
	}
	
	public static int Fun(int m){
		int sum,sum1,sum2;
		if(m==0)
			return 1;
		if(m==1)
			return 1;
		else
		{
			sum=0;sum1=1;sum2=1;
			for(int i=2;i<=m;i++){
				sum=sum1+sum2;
				sum1=sum2;
				sum2=sum;
			}
			return sum;
//			return Fun(m-1)+Fun(m-2);
		}
	}
}	
	
//	double fib,b,c;
//	b=(1+Math.sqrt(5))/2;
//	c=(1-Math.sqrt(5))/2;
//
//	fib=1/Math.sqrt(5)*(Math.pow(b,a)-Math.pow(c,a));
//	
	
//	ArrayList fib=new ArrayList();
//	fib.add(1);	
//	fib.add(1);
//
//	for(int i=2;i<a;i++)
//	{
//		fib.add(fib[i-1]+fib[i-2])
//	}
//	System.out.println((int)fib);
//}
//
//public static int[] Fun(int m){
//	int[] fib = new int[m+1];
//	
//	if(m>=0){
//		fib[0] = 1;
//	}
//	if(m>=1){
//		fib[0] = fib[1] = 1;
//	}
//	for(int t=2; t<=m; t++){
//		fib[t] = fib[t-1]+fib[t-2];
//	}
//
//	return fib;
//}



