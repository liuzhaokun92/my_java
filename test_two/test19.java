package test_two;//���߳�
//��ϰ
public class test19{
	public static void main(String[] args){
		TestThread T=new TestThread();
		Thread t=new Thread(T);
		t.start();
		System.out.println("main����ʼ");
		try{
			Thread.sleep(10000);
		}catch(InterruptedException x){}
		System.out.println("main�ж���������");
		t.interrupt();
		System.out.println("main����");
		
	}
}

class TestThread implements Runnable{
	public void run(){
		try{
			System.out.println("�����߳̿�ʼ���У�");
			Thread.sleep(20000);
			System.out.println("���߽���");
		}
		catch(InterruptedException x){
			System.out.println("�ж����߳�");
			return;
		}
		System.out.println("�����߳���������");
		
	}
}
////19-20
//public class test19{
//	public static void main(String[] args){
//		TestThread t=new TestThread();
//		new Thread(t).start();
//		for(int i=0;i<10;i++){
//			if(i==5)
//				t.stopMe();
//			System.out.println("Main�߳���������");
//		}
//	}
//}
//class TestThread implements Runnable{
//	private boolean bFlag=true;
//	public void stopMe(){
//		bFlag=false;
//	}
//	public void run(){
//		while(bFlag){
//			System.out.println(Thread.currentThread().getName()+" ������");
//		}
//	}
//}
//19-19
//�߳�֮���ͨ�ţ��ȴ�wait();����notify();
//	class Producer implements Runnable{
//		P q=null;
//		public Producer(P q){
//			this.q=q;
//		}
//		public void run(){
//			int  i=0;
//			while(true){
//				if(i==0){
//					q.set("����","��");
//				}
//				else {
//					q.set("����","Ů");
//				}
//				i=(i+1)%2;
//			}
//		}
//	}
//	class P{
//		private String name="����";
//		private String sex="Ů";
//		boolean bFull=false;		//��bFull����ʾ���ݴ洢�ռ��״̬
//		public synchronized void set(String name,String sex){
//			if(bFull){
//				try{
//					wait();
//				}catch(InterruptedException e){}
//			}
//			this.name=name;
//			try{
//				Thread.sleep(10);			
//			}catch(Exception e){
//				System.out.println(e.getMessage());
//			}
//			this.sex=sex;
//			bFull=true;
//			notify();
//		}
//		public synchronized void get(){
//			if(!bFull){
//				try{
//					wait();
//				}catch(InterruptedException e){}
//			}
//			System.out.println(name+"---->>"+sex);
//			bFull=false;
//			notify();
//		}
//	}
//	class Consumer implements Runnable{
//		P q=null;
//		public Consumer(P q){
//			this.q=q;
//		}
//		public void run(){
//			while(true){
//				q.get();		
//			}
//		}
//	}
//	public class test19{
//		public static void main(String[] args){
//			P q=new P();
//			new Thread(new Producer(q)).start();
//			new Thread(new Consumer(q)).start();
//		}
//	}
	
//19-18
//ͨ��set()��get()����ʵ���߳����ݵ�ͬ��
//class Producer implements Runnable{
//	P q=null;
//	public Producer(P q){
//		this.q=q;
//	}
//	public void run(){
//		int  i=0;
//		while(true){
//			if(i==0){
//				q.set("����","��");
//			}
//			else {
//				q.set("����","Ů");
//			}
//			i=(i+1)%2;
//		}
//	}
//}
//class P{
//	private String name="����";
//	private String sex="Ů";
//	public synchronized void set(String name,String sex){
//		this.name=name;
//		this.sex=sex;
//	}
//	public synchronized void get(){
//		System.out.println(this.name+"---->>"+this.sex);
//	}
//}
//class Consumer implements Runnable{
//	P q=null;
//	public Consumer(P q){
//		this.q=q;
//	}
//	public void run(){
//		while(true){
//			q.get();		
//		}
//	}
//}
//public class test19{
//	public static void main(String[] args){
//		P q=new P();
//		new Thread(new Producer(q)).start();
//		new Thread(new Consumer(q)).start();
//	}
//}

//19-17
//�߳�֮���ͨ�ţ����ֻ���
//class Producer implements Runnable{
//	P q=null;
//	public Producer(P q){
//		this.q=q;
//	}
//	public void run(){
//		int  i=0;
//		while(true){
//			if(i==0){
//				q.name="����";
//				q.sex="��";
//			}
//			else {
//				q.name="����";
//				q.sex="Ů";
//			}
//			i=(i+1)%2;
//		}
//	}
//}
//class P{
//	String name="����";
//	String sex="Ů";
//}
//class Consumer implements Runnable{
//	P q=null;
//	public Consumer(P q){
//		this.q=q;
//	}
//	public void run(){
//		while(true){
//			System.out.println(q.name+"---->>"+q.sex);
//		}
//	}
//}
//public class test19{
//	public static void main(String[] args){
//		P q=new P();
//		new Thread(new Producer(q)).start();
//		new Thread(new Consumer(q)).start();
//	}
//}
//19-16�����������
//class A{
//	synchronized void funA(B b){
//		String name=Thread.currentThread().getName();
//		System.out.println(name+"����A.����");
//		try{
//			Thread.sleep(1000);
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
//		System.out.println(name+"����B���е�last()����");
//		b.last();
//	}
//	synchronized void last(){
//		System.out.println("A���е�last()����");
//	}
//}
//class B{
//	synchronized void funB(A a){
//		String name=Thread.currentThread().getName();
//		System.out.println(name+"����B���е�");
//		try{
//			Thread.sleep(1000);
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
//		System.out.println(name+"����A���е�last()����");
//		a.last();
//	}
//	synchronized void last(){
//		System.out.println("B���е�last()����");
//	}	
//}
//class test19 implements Runnable{
//	A a=new A();
//	B b=new B();
//	test19(){
//		Thread.currentThread().setName("main---->>Thread");
//		new Thread(this).start();
//		a.funA(b);
//		System.out.println("main�߳��������");
//	}
//	public void run(){
//		Thread.currentThread().setName("Thread--->>Thread");
//		b.funB(a);
//		System.out.println("�����߳��������");
//	}
//	public static void main(String[] args){
//		new test19();
//	}
//}
//19-15-2�ؼ���synchronizedͬ������
//public class test19{
//	public static void main(String[] args){
//		TestThread t=new TestThread();
//		new Thread(t).start();
//		new Thread(t).start();
//		new Thread(t).start();
//		new Thread(t).start();
//	}
//}
//class TestThread implements Runnable{
//	private int tickets=20;
//	public void run(){
//		while(true){
//			sale();
//		}
//	}
//	public synchronized void sale(){
////		�ؼ���synchronizedͬ������
//			if (tickets>0){
//				try{
//					Thread.sleep(100);
//				}catch(Exception e){}
//				System.out.println(Thread.currentThread().getName()+"����Ʊ"+tickets--);
//			}
//		
//	}
//}

//19-15-1:�γ�ͬ������飺synchronized()
//	public class test19{
//		public static void main(String[] args){
//			TestThread t=new TestThread();
//			new Thread(t).start();
//			new Thread(t).start();
//			new Thread(t).start();
//			new Thread(t).start();
//		}
//	}
//	class TestThread implements Runnable{
//		private int tickets=20;
//		public void run(){
//			while(true){
//				synchronized(this){		//�γ�ͬ�������;
//					if (tickets>0){
//						try{
//							Thread.sleep(100);
//						}catch(Exception e){}
//						System.out.println(Thread.currentThread().getName()+"����Ʊ"+tickets--);
//					}
//				}
//			}
//		}
//	}

//19-15
//�̵߳�ͬ�����⣬��������bug
//	public class test19{
//		public static void main(String[] args){
//			TestThread t=new TestThread();
//			new Thread(t).start();
//			new Thread(t).start();
//			new Thread(t).start();
//			new Thread(t).start();
//		}
//	}
//	class TestThread implements Runnable{
//		private int tickets=20;
//		public void run(){
//			while(true){
//				if (tickets>0){
//					try{
//						Thread.sleep(100);
//					}catch(Exception e){}
//					System.out.println(Thread.currentThread().getName()+"����Ʊ"+tickets--);
//				}
//			}
//		}
//	}


//19-14
//�ж�main�߳�----���׳��쳣---������жϱ�־----�����»ص��߳�
//	public class test19{
//		public static void main(String[] args){
//			Thread t=Thread.currentThread();
//			System.out.println("A:t.isInterrupted()="+t.isInterrupted());
//			t.interrupt();
//			System.out.println("B:t.isInterrupted()="+t.isInterrupted());
//			System.out.println("c:t.isInterrupted()="+t.isInterrupted());
//			try{
//				Thread.sleep(2000);
//				System.out.println("�߳�û�б��жϣ�");
//			}catch(InterruptedException x){
//				System.out.println("�̱߳��ж�");
//			}
//			System.out.println("D:t.isInterrupted()="+t.isInterrupted());
//	
//		}
//	}

//19-13
//�̵߳��жϣ�interrupt()
//	public class test19 implements Runnable{
//		public void run(){
//			try{
//				System.out.println("��run������ -����߳�����20��");
//				Thread.sleep(10000);		//ԭ��������20000
//				System.out.println("��run������ -��������");
//			}catch(InterruptedException x){
//				System.out.println("��run������ -�ж��߳�");
//				return;
//			}
//			System.out.println("��run������ -����֮�����������");
//			System.out.println("��run������ -�����˳�");
//		}
//		public static void main(String[] args){
//			test19 si=new test19();
//			Thread t=new Thread(si);
//			t.start();
//			try{
//				Thread.sleep(20000);		//ԭ���Ķ�����2000
//			}catch(InterruptedException x){}
//			System.out.println("��main������ -�ж������߳�");
//			t.interrupt();
//			System.out.println("��main������ -�˳�");
//		}
//	}

//19-12
//�̵߳����ߣ�sleep();
//	public class test19 extends Thread{
//		public void run(){
//			loop();
//		}
//		public void loop(){
//			String name=Thread.currentThread().getName();
//			System.out.println(name+"---->>�ոս���loop����");
//			for(int i=0;i<10;i++){
//				try{
//					Thread.sleep(200);
//				}catch(InterruptedException x){}
//				System.out.println("name="+name+"    i="+i);
//			}
//			System.out.println(name+"---->>�뿪loop����");
//		}
//		public static void main(String[] args){
//			test19 tt=new test19();
//			tt.setName("my worker Thread");
//			tt.start();
//			try{
//				Thread.sleep(700);
//			}catch(InterruptedException x) {}
//			tt.loop();
//		}
//	}

//19-11
//�̵߳�ǿ������pp.join()
//	public class test19{
//		public static void main(String[] args){
//			TestThread t=new TestThread();
//			Thread pp=new Thread(t);
//			pp.start();
//			int i=0;
//			for(int x=0;x<10;x++){
//				if (x==5){
//					try{
//						pp.join();
//					}
//					catch(Exception e){
//						System.out.println(e.getMessage());
//					}
//				}
//				System.out.println("main Thread "+i++);
//			}
//		}
//	}
//	class TestThread implements Runnable{
//		public void run(){
//			String str=new String();
//			int i=0;
//			for(int x=0;x<10;x++){
//				System.out.println(Thread.currentThread().getName()+"----->"+i++);
//			}
//		}
//	}

//19-10
//��̨�߳���setDaemon()���������һ��������ֻʣ�º�̨���������У���������̾ͻ������
//��ĳ���̵߳�����setDaemon()������������߳�ת���̨���С�
//public class test19{
//		public static void main(String[] args){
//			TestThread t=new TestThread();
//			Thread tt=new Thread(t);
//			tt.setDaemon(true);
//			tt.start();
//		}
//	}
//	class TestThread implements Runnable{
//		public void run(){
//			while(true){  
//				System.out.println(Thread.currentThread().getName()+"is running.");
//			}
//		}
//	}

////19-9 �ж��߳��Ƿ�����isAlive();
//public class test19 extends Thread{
//	public void run(){
//		for(int i=0;i<10;i++){
//			printMsg();
//		}
//	}
//	public void printMsg(){
//		Thread t=Thread.currentThread();
//		String name=t.getName();
//		System.out.println("name="+name);
//	}
//	public static void main(String[] args){
//		test19 t=new test19();
//		t.setName("test thread");
//		System.out.println("�ڵ���start()����֮ǰ��t.isAlive()="+t.isAlive());
//		t.start();
//		System.out.println("�ոյ���start()����ʱ��t.isAlive()="+t.isAlive());
//		
//		for(int i=0;i<10;i++){
//			t.printMsg();
//		}
//		System.out.println("main����ʱ��t.isAlive()="+t.isAlive());
//	}
//}

//19-8 �����߳����ƣ�setName();
//	public class test19 extends Thread{
//		public void run(){
//			for(int i=0;i<10;i++){
//				printMsg();
//			}
//		}
//		public void printMsg(){
//			Thread t=Thread.currentThread();
//			String name=t.getName();
//			System.out.println("name="+name);
//		}
//		public static void main(String[] args){
//			test19 tt=new test19();
//			test19 t1=new test19();
//			tt.setName("test thread");
//			tt.start();
//			for(int i=0;i<10;i++){
//				tt.printMsg();
//			}
//			t1.start();
//		}
//	}

//	19-7 �߳����Ƶķ���:getName();
//	public class test19 extends Thread{
//		public void run(){
//			for(int i=0;i<10;i++){
//				printMsg();
//			}
//		}
//		public void printMsg(){
//			Thread t=Thread.currentThread();
//			String name=t.getName();
//			System.out.println("name="+name);
//		}
//		public static void main(String[] args){
//			test19 t1=new test19();
//			t1.start();
//			for(int i=0;i<10;i++){
//				t1.printMsg();
//			}
//		}
//	}

//	19-6 ��Runnable�ӿ�ʵ�ֶ��߳�ʹ��
//	public class test19{
//		public static void main(String[] args){
//			TestThread t=new TestThread();
//			new Thread(t).start();
//			new Thread(t).start();
//			new Thread(t).start();
//			new Thread(t).start();
//		}
//	}
//	class TestThread implements Runnable{
//		private int tickets=20;
//		public void run(){
//			while(true){
//				if(tickets>0)
//					System.out.println(Thread.currentThread().getName()+"����Ʊ"+tickets--);
//			}
//		}
//	}

//19-5 Thread��ļ̳�ʹ��ʵ��
//	public class test19{
//		public static void main(String args[]){
//			new TestThread().start();
//			new TestThread().start();
//			new TestThread().start();
//			new TestThread().start();
//		}
//	}
//	class TestThread extends Thread{
//		private int tickets=20;
//		public void run(){
//			while(true){
//				if (tickets>0)
//					System.out.println(Thread.currentThread().getName()+"����Ʊ"+tickets--);
//			}
//		}
//	}
//19-4 Thread��ļ̳�ʹ��
//	public class test19{
//		public static void main(String args[]){
//			TestThread t=new TestThread();
//			t.start();
//			t.start();
//			t.start();
//			t.start();
//			
//		}
//	}
//	class TestThread extends Thread{
//		private int tickets=20;
//		public void run(){
//			while(true){
//				if(tickets>0)
//					System.out.println(Thread.currentThread().getName()+"����Ʊ"+tickets--);
//			}
//		}
//	}

//19-3ͨ�� ʵ��Runtable�ӿ�ʵ�ֶ��߳�???
//	public class test19{
//		public static void main(String args[]){
//			TestThread t=new TestThread();
//			new Thread().start();
//			for(int i=0;i<10;i++){
//				System.out.println("main");
//			}
//		}
//	}
//	class TestThread implements Runnable{
//		public void run(){
//			for(int i=0;i<10;i++){
//				System.out.println("testthread");
//			}
//		}
//	}


//19-2ͬʱ�������߳�???
//	public class test19{
//		public static void main(String args[]){
//			new TestThread().start();
//			for(int i=0;i<10;i++){
//				System.out.println("main�߳�������");
//			}
//		}
//	}
//	class TestThread extends Thread{
//		public void run(){
//			for(int i=0;i<10;i++){
//				System.out.println("TestThread�߳���������");
//			}
//		}
//	}

//19-1�߳�ʹ�÷���
//	public class test19 {
//		public static void main(String args[]){
//			new TestThread().run();
//			for(int i=0;i<10;i++){
//				System.out.println("main�߳�������");
//			}
//		}
//	}
//	class TestThread{
//		public void run(){
//			for(int i=0;i<10;i++){
//				System.out.println("TestThread��������");
//			}
//		}
//	}

