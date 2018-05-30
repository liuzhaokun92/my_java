package xuetang;
/*最大公约数和最小公倍数

输入两个正整数m和n，求其最大公约数和最小公倍数
输入
34 8
输出
2 136
*/
import java.util.Scanner;
public class Test4_2 {
	public static int min(int a,int b){
		int temp;
		if(a<b){
			temp=a;
		}
		else
			temp=b;
		for(int i=temp;i>0;i--){
			if((a%i==0)&&(b%i==0))
				return i;
		}
		return 0;
	
	}
	public static int max(int a,int b){
		int temp;
		if(a>b){
			temp=a;
		}
		else
			temp=b;
		for(int i=temp;;i++){
			if(i%a==0&&i%b==0)
				return i;
		}		
	}
	
	public static void main(String[] args) {
//		for(;;){
			Scanner scanner=new Scanner(System.in);
			int a[]=new int[2];
			String re;
			String res[]=new String[2];
//			System.out.println("输入两个数：");
			re=scanner.nextLine();
			res=re.split(" ");
			for(int i=0;i<2;i++){
				a[i]=Integer.parseInt(res[i]);
			}
			System.out.println(min(a[0],a[1])+" "+max(a[0],a[1]));
//		}
	}
}
