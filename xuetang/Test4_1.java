package xuetang;
/*偶数分解

歌德巴赫猜想：任何一个大于六的偶数可以拆分成两个质数的和，打印出所有的可能
输入n为偶数,输出n的所有分界可能
如输入
100
输出：
100=3+97
100=11+89
100=17+83
100=29+71
100=41+59
100=47+53
*/
import java.util.*;
public class Test4_1 {
	public static int primenumber(int a){
		for(int i=2;i<=a/2;i++){
			if(a%i==0){
				return 0;
			}	
		}
		return a;
	}
	
	public static void main(String[] args) {
//		for(;;){
			Scanner scanner=new Scanner(System.in);
			int num1,num;
//			System.out.println("输入一个大于6的偶数：");
			num=scanner.nextInt();
			if(num<=6){
//				continue;
				return;
			}
			else if(num%2!=0)
//				continue;
				return;
			else{
					for(int i=2;i<=num/2;i++){
						if(primenumber(i)!=0){
							num1=num-i;
							if(primenumber(num1)!=0)
								System.out.println(num+"="+i+"+"+num1);
						}
						else
							continue;
					}
			}
//		}
	}
}
