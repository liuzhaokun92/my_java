/*
多类型排序

我们现在有一些数据，是整数和字符串混杂的。现在需要你将他们分开，并且分别进行排序。 
请你利用泛型实现一个数组类，并且实现排序函数，使得其既可以对Integer类型进行排序，又可以对String类型进行排序。然后利用你实现的这个类完成上面的任务。
输入格式：
一行，一个数字n，表示元素的格式。
n行，每行一个字符串整数，也可以是其他字符串。
输出格式：
n行，前面一部分为输入的整数字符串按从小到大排序输出，后面一部分为非整数字符串按照字典序从小到大输出。
输入样例：
5
12
ab
bd
32
t
输出样例：
12
23
ab
bd
t

*/package xuetang;
import java.util.*;
class GeneralMethod<Type>{
	public void sort(GeneralMethod<?> o){	
	}
	
}
public class Test3_3 {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int num;
		System.out.println("输入个数");
		num=scanner.nextInt();
		System.out.println("输入要排序的内容：");
		String[][] a=new String[num][];
		for(int i=0;i<num;i++){
			ArrayList s=new ArrayList();
			while(scanner.next()!="\n"){
				s.add(scanner.next());
			}
			String[] str=new String[s.size()];
			s.toArray(str);
			a[i]=str;
		}
	}
}
