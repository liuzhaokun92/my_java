package xuetang;
/*��ש����

������ש���ֱ���1*1��ש��1*2��ש����������ש��1*N�ĵ��棬�ʹ��ж������̷�������ΪN���������Ӧ���̷���
���룺
3
�����
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
//			System.out.println("����N:");
			a=scanner.nextInt();
			if(a<0)
				return;
			else
				System.out.println(number(a));
//			}

	}
}
