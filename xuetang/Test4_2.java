package xuetang;
/*���Լ������С������

��������������m��n���������Լ������С������
����
34 8
���
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
//			System.out.println("������������");
			re=scanner.nextLine();
			res=re.split(" ");
			for(int i=0;i<2;i++){
				a[i]=Integer.parseInt(res[i]);
			}
			System.out.println(min(a[0],a[1])+" "+max(a[0],a[1]));
//		}
	}
}
