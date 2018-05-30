package xuetang;
/*铺砖问题

有两种砖，分别是1*1的砖和1*2的砖，用这两种砖铺1*N的地面，问共有多少种铺法。输入为N，请输出相应的铺法数
输入：
3
输出：
3
*/


import java.util.*;
public class Test4_3 {
	public static long number(int x){
		long sum,sum1,sum2;
		if(x==0){
			return 0;
		}
		else if(x==1)
			return 1;
		else if(x==2)
			return 2;
		else{
			sum=0;sum1=1;sum2=2;
			for(int i=3;i<=x;i++){
				sum=sum1+sum2;
				sum1=sum2;
				sum2=sum;
				}
			return sum;
		}
			
//		return number(x-1)+number(x-2);
	}
	public static void main(String[] args) {
//		for(;;){
			Scanner scanner=new Scanner(System.in);
			int a;
//			System.out.println("输入N:");
			a=scanner.nextInt();
			if(a<0)
				return;
			else
				System.out.println(number(a));
//			}

	}
}
