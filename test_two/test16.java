package test_two;
import java.util.*;
public class test16{
	public static void main(String[] args)
	{
		ArrayList a0=new ArrayList();

		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		ArrayList a3=new ArrayList();
		ArrayList a4=new ArrayList();
		ArrayList a5=new ArrayList();
		ArrayList a6=new ArrayList();
		ArrayList a7=new ArrayList();
		ArrayList a8=new ArrayList();
		ArrayList a9=new ArrayList();

		for(int i1=1;i1<10;i1++)
		{
			a1.add(i1);
			for(int i2=i1+1;i2<10;i2++)
			{
				a2.add(i1*i2);
				for(int i3=i2+1;i3<10;i3++)
				{
					a3.add(i1*i2*i3);
					for(int i4=i3+1;i4<10;i4++)
					{
						a4.add(i1*i2*i3*i4);
						for(int i5=i4+1;i5<10;i5++)
						{
							a5.add(i1*i2*i3*i4*i5);
							for(int i6=i5+1;i6<10;i6++)
							{
								a6.add(i1*i2*i3*i4*i5*i6);
								for(int i7=i6+1;i7<10;i7++)
								{
									a7.add(i1*i2*i3*i4*i5*i6*i7);
									for(int i8=i7+1;i8<10;i8++)
									{
										a8.add(i1*i2*i3*i4*i5*i6*i7*i8);
										for(int i9=i8+1;i9<10;i9++)
										{
											a9.add(i1*i2*i3*i4*i5*i6*i7*i8*i9);
										}
									}
								}
							}
						}
					}
				}
			}	
		}
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);

		a0.addAll(a1);
		a0.addAll(a2);
		a0.addAll(a3);
		a0.addAll(a4);
		a0.addAll(a5);
		a0.addAll(a6);
		a0.addAll(a7);
		a0.addAll(a8);
		a0.addAll(a9);
		
		List res = new ArrayList();
		
		for(int i = 0;i<a0.size(); i++) {  
		        if(!res.contains(a0.get(i))) {  
		            res.add(a0.get(i));  
		        }  
		 }
		 System.out.println(res.size());
	}
}

////��ϰ
//import java.util.*;
//public class test16{
//	public static void main(String[] args){
//		TreeSet ts=new TreeSet();
//		
//		ts.add("3");
//		ts.add("6");
//		ts.add("9");
//		ts.add("7");
//		ts.add("18");
//		ts.add("25");
////		System.out.println(ts);
//		
//		Iterator i=ts.iterator();
//		while(i.hasNext())
//		{
//			Object element=i.next();
//			System.out.print(element+" ");
//		}
//
//	}
//}

////16-15
//import java.io.*;
//import java.util.*;
//public class test16{
//	public static void main(String[] args){
//		Properties settings=new Properties();
//		try
//		{
//			settings.load(new FileInputStream("C\\count.java"));
//		}
//		catch(Exception e)
//		{
//			settings.setProperty("count", new Integer(0).toString());
//		}
//		int c=Integer.parseInt(settings.getProperty("count"))+1;
//		System.out.println("���Ǳ������"+c+"�α�ʹ��");
//		settings.put("count",new Integer(c).toString());
//		try
//		{
//			settings.store(new FileOutputStream("c\\count.java"), "PropertiesFile use it.");
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//	}
//}

////16-14
//import java.util.*;
//public class test16{
//	public static void main(String[] args){
//		Properties capitals=new Properties();
//		Set states;
//		String str;
//		capitals.put("�й�","����");
//		capitals.put("����˹","Ī˹��");
//		capitals.put("�ձ�","����");
//		capitals.put("����","����");
//		capitals.put("Ӣ��","�׶�");
//		states=capitals.keySet();
//		Iterator itr=states.iterator();
//		while(itr.hasNext())
//		{
//			str=(String)itr.next();
//			System.out.println("���ң�"+str+"���׶���"+capitals.getProperty(str)+".");
//		}
//		System.out.println();
//		str="����";//=capitals.getProperty("����","û�з���");
//		System.out.println("�������׶���"+capitals.getProperty(str)+".");
//	}
//}

////16-13
//import java.util.*;
//public class test16{
//	public static void main(String[] args){
//		Hashtable numbers=new Hashtable();
//		numbers.put("one",new Integer(1));
//		numbers.put("two",new Integer(2));
//		numbers.put("three",new Integer(3));
//		Integer n=(Integer)numbers.get("three");
//		if(n!=null)
//		{
//			System.out.println("two="+n);
//		}
//	}
//}

////16-12
//import java.util.*;
//public class test16{
//	static void showpush(Stack st,int a)
//	{
//		st.push(new Integer(a));
//		System.out.println("��ջ��"+a+")");
//		System.out.println("Stack:"+st);
//	}
//	static void showpop(Stack st)
//	{
//		System.out.print("��ջ->");
//		Integer a=(Integer)st.pop();
//		System.out.println(a);
//		System.out.println("Stack:"+st);
//	}
//	public static void main(String[] args)
//	{
//		Stack st=new Stack();
//		System.out.println("StackL:"+st);
//		showpush(st,42);
//		showpush(st,66);
//		showpush(st,99);
//		showpop(st);
//		showpop(st);
//		showpop(st);
//		try
//		{
//			showpop(st);
//		}
//		catch(EmptyStackException e)
//		{
//			System.out.println("�����쳣��ջ������Ϊ��");
//		}
//	}
//}

////16-11
//import java.util.*;
//public class test16{
//	public static void main(String[] args){
//		Vector v=new Vector();
//		v.add("A");
//		v.add("B");
//		v.add("C");
//		v.add("D");
//		v.add("E");
//		v.add("F");
//		Enumeration e=v.elements();
//		while(e.hasMoreElements())
//		{
//			System.out.print(e.nextElement()+"\t");
//		}
//	}
//}

//16-10
//import java.util.*;
//class employee implements Comparator
//{
//	public int compare(Object a,Object b)
//	{
//		int k;
//		String aStr,bStr;
//		aStr=(String) a;
//		bStr=(String) b;
//		k=aStr.compareTo(bStr);
//		if (k==0)
//			return aStr.compareTo(bStr);
//		else 
//			return k;
//	}
//}
//public class test16
//{
//	public static void main(String[] args)
//	{
//		TreeMap tm=new TreeMap(new employee());
//		tm.put("Z������", new Double(3534.34));
//		tm.put("L������", new Double(126.22));
//		tm.put("W������", new Double(1578.40));
//		tm.put("Z������", new Double(99.62));
//		tm.put("S������", new Double(-29.08));
//		Set set=tm.entrySet();
//		Iterator itr=set.iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry me=(Map.Entry)itr.next();
//			System.out.print(me.getKey()+":");
//			System.out.println(me.getValue());
//		}
//		System.out.println();
//		double balance=((Double)tm.get("Z������")).doubleValue();
//		tm.put("Z������",new Double(balance+2000));
//		System.out.println("�������µ��ʽ����ǣ�"+tm.get("Z������"));
//	}
//}

////16-9
//import java.util.*;
//class mycomp implements Comparator
//{
//	public int compare(Object o1,Object o2)
//	{
//		String aStr,bStr;
//		aStr=(String) o1;
//		bStr=(String) o2;
//		return bStr.compareTo(aStr);
//	}
//}
//public class test16
//{
//	public static void main(String[] args)
//	{
//		TreeSet ts=new TreeSet(new mycomp());
//		ts.add("C");
//		ts.add("A");
//		ts.add("B");
//		ts.add("E");
//		ts.add("F");
//		ts.add("D");
//		Iterator i=ts.iterator();
//		while(i.hasNext())
//		{
//			Object element=i.next();
//			System.out.print(element+" ");
//		}
//	}
//}

////16-8
//import java.util.*;
//public class test16{
//	public static void main(String[] args){
//		TreeMap tm=new TreeMap();
//		tm.put(new Integer(10000-2000), "zs");
//		tm.put(new Integer(10000-1500), "ls");
//		tm.put(new Integer(10000-2500), "ww");
//		tm.put(new Integer(10000-5000), "zl");
//		Collection col=tm.values();
//		Iterator i=col.iterator();
//		System.out.println("���չ����ɵ͵��ߵ�˳�������");
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//	}
//}

////16-7
//import java.util.*;
//public class test16{
//	public static void main(String[] args)
//	{
//		HashMap hm=new HashMap();
//		hm.put("Jone Doe", new Double(3434.34));
//		hm.put("Tom Smith", new Double(123.22));
//		hm.put("Jane Baker", new Double(1378.00));
//		hm.put("Todd Hall", new Double(99.22));
//		hm.put("Ralph Smith", new Double(-19.08));
//		
//		
//		Set set=hm.entrySet();     //���ذ���ӳ������ļ���
//		Iterator i=set.iterator();  //��Iterator�õ�hashmap�е�����
//		while(i.hasNext())
//		{
//			Map.Entry me=(Map.Entry)i.next();      //Map.Entry���Խ���ӳ�������
//			System.out.print(me.getKey()+":"+me.getValue()+"\n");
//			//System.out.println(me.getValue());
//		}
//		System.out.println();
//		double balance=((Double)hm.get("Jone Doe")).doubleValue();
//		hm.put("Jone Doe", new Double(balance+1000));
//		System.out.println("Jone Doe's money now is:"+hm.get("Jone Doe"));
//	}
//}

////16-6
//import java.util.*;
//public class test16{
//	public static void main(String[] args){
//		ArrayList al= new ArrayList();
//		al.add("C");
//		al.add("A");
//		al.add("E");
//		al.add("B");
//		al.add("D");
//		al.add("F");
//		System.out.print("al��ԭʼ�����ǣ�");
//		Iterator itr=al.iterator();
//		while(itr.hasNext())         //hasNext():���������һ��Ԫ�أ������棬���򷵻ؼ�
//		{
//			Object element=itr.next();      
//			System.out.print(element+" ");       //ע�⣺�����ʱ��ÿ��Ԫ�غ�����˸��ո�
//		}
//		System.out.println();
//		ListIterator litr=al.listIterator();
//		while (litr.hasNext())         ////hasNext():���������һ��Ԫ�أ������棬���򷵻ؼ�  
//		{
//			Object element=litr.next();
//			litr.set(element+"+");      //�޸ģ���ԭ�����ݵĺ�������ˡ�+��
//		}
//		System.out.print("a1�޸�֮��������ǣ�");
//		itr=al.iterator();
//		while(itr.hasNext())             //hasNext():���������һ��Ԫ�أ������棬���򷵻ؼ�
//		{
//			Object element=itr.next();
//			System.out.print(element+" ");    
//		}
//		System.out.println();
//		System.out.print("���б��������");
//		while(litr.hasPrevious())         //hasPerious()�������ǰһ��Ԫ�أ������棬���򷵻ؼ�
//		{
//			Object element=litr.previous();
//			System.out.print(element+" ");
//		}
//		System.out.println();
//	}
//}

////16-5
//import java.util.*;
//public class test16{
//	public static void main(String[] args){
//		TreeSet ts=new TreeSet();
//		ts.add("C");
//		ts.add("A");
//		ts.add("B");
//		ts.add("E");
//		ts.add("F");
//		ts.add("D");
//		System.out.println(ts);
//	}
//}

////16-4
//import java.util.*;
//public class test16{
//	public static void main(String[] args)
//	{
//		HashSet hs=new HashSet();
//		hs.add("B");
//		hs.add("A");
//		hs.add("D");
//		hs.add("E");
//		hs.add("C");
//		hs.add("F");
//		System.out.println(hs);
//
//	}
//}

////16-3
//import java.util.*;
//public class test16{
//	public static void main(String[] args)
//	{
//		LinkedList ll=new LinkedList();
//		ll.add("F");
//		ll.add("B");
//		ll.add("D");
//		ll.add("E");
//		ll.add("C");
//		ll.addLast("Z");
//		ll.addFirst("A");
//		ll.add(1,"A2");
//		System.out.println("���ll�������ǣ�"+ll);
//		ll.remove("F");
//		ll.remove(2);
//		System.out.println("��һ���Ƴ���ll:"+ll);
//		ll.removeFirst();
//		ll.removeLast();
//		System.out.println("�ڶ����Ƴ�֮���ll�ǣ�"+ll);
//		Object val=ll.get(2);
//		ll.set(2,(String) val+" changed");
//		System.out.println("�ı�֮���ll:"+ll);
//	
//	}
//}

////16-2
//import java.util.*;
//public class test16{
//	public static void main(String[] args)
//	{
//		ArrayList al=new ArrayList();
//		al.add(new Integer(1));
//		al.add(new Integer(2));
//		al.add(new Integer(3));
//		al.add(new Integer(4));
//		System.out.println("Arraylist�е������ǣ�"+al);
//		Object ia[]=al.toArray();
//		int sum=0;
//		for(int i=0;i<ia.length;i++)
//			sum+=((Integer)ia[i]).intValue();
//		System.out.println("�����ۼӵĽ���ǣ�"+sum);
//	}
//}

//16-1
//import java.util.*;
//public class test16 {
//	public static void main(String[] args)
//	{
//		ArrayList al=new ArrayList();
//		System.out.println("a1�ĳ�ʼ����С��"+al.size());
//		
//		al.add("C");
//		al.add("A");
//		al.add("E");
//		al.add("B");
//		al.add("D");
//		al.add("F");
//		
//		al.add(1,"A2");
//		System.out.println("a1����Ԫ�غ�Ĵ�С��"+al.size());
//		System.out.println("a1 �����ݣ�"+al);
//		al.remove("F");
//		al.remove(2);
//		System.out.println("a1 ɾ��Ԫ��֮��Ĵ�С��"+al.size());
//		System.out.println("a1�����ݣ�"+al);
//	}
//}
