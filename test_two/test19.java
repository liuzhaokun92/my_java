package test_two;//多线程
//练习
public class test19{
	public static void main(String[] args){
		TestThread T=new TestThread();
		Thread t=new Thread(T);
		t.start();
		System.out.println("main程序开始");
		try{
			Thread.sleep(10000);
		}catch(InterruptedException x){}
		System.out.println("main中断其他程序");
		t.interrupt();
		System.out.println("main结束");
		
	}
}

class TestThread implements Runnable{
	public void run(){
		try{
			System.out.println("其他线程开始进行：");
			Thread.sleep(20000);
			System.out.println("休眠结束");
		}
		catch(InterruptedException x){
			System.out.println("中断了线程");
			return;
		}
		System.out.println("其他线程正常结束");
		
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
//			System.out.println("Main线程正在运行");
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
//			System.out.println(Thread.currentThread().getName()+" 在运行");
//		}
//	}
//}
//19-19
//线程之间的通信，等待wait();唤醒notify();
//	class Producer implements Runnable{
//		P q=null;
//		public Producer(P q){
//			this.q=q;
//		}
//		public void run(){
//			int  i=0;
//			while(true){
//				if(i==0){
//					q.set("张三","男");
//				}
//				else {
//					q.set("李四","女");
//				}
//				i=(i+1)%2;
//			}
//		}
//	}
//	class P{
//		private String name="李四";
//		private String sex="女";
//		boolean bFull=false;		//用bFull来表示数据存储空间的状态
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
//通过set()和get()方法实现线程内容的同步
//class Producer implements Runnable{
//	P q=null;
//	public Producer(P q){
//		this.q=q;
//	}
//	public void run(){
//		int  i=0;
//		while(true){
//			if(i==0){
//				q.set("张三","男");
//			}
//			else {
//				q.set("李四","女");
//			}
//			i=(i+1)%2;
//		}
//	}
//}
//class P{
//	private String name="李四";
//	private String sex="女";
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
//线程之间的通信，出现混乱
//class Producer implements Runnable{
//	P q=null;
//	public Producer(P q){
//		this.q=q;
//	}
//	public void run(){
//		int  i=0;
//		while(true){
//			if(i==0){
//				q.name="张三";
//				q.sex="男";
//			}
//			else {
//				q.name="李四";
//				q.sex="女";
//			}
//			i=(i+1)%2;
//		}
//	}
//}
//class P{
//	String name="李四";
//	String sex="女";
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
//19-16程序产生死锁
//class A{
//	synchronized void funA(B b){
//		String name=Thread.currentThread().getName();
//		System.out.println(name+"进入A.方法");
//		try{
//			Thread.sleep(1000);
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
//		System.out.println(name+"调用B类中的last()方法");
//		b.last();
//	}
//	synchronized void last(){
//		System.out.println("A类中的last()方法");
//	}
//}
//class B{
//	synchronized void funB(A a){
//		String name=Thread.currentThread().getName();
//		System.out.println(name+"进入B类中的");
//		try{
//			Thread.sleep(1000);
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
//		System.out.println(name+"调用A类中的last()方法");
//		a.last();
//	}
//	synchronized void last(){
//		System.out.println("B类中的last()方法");
//	}	
//}
//class test19 implements Runnable{
//	A a=new A();
//	B b=new B();
//	test19(){
//		Thread.currentThread().setName("main---->>Thread");
//		new Thread(this).start();
//		a.funA(b);
//		System.out.println("main线程运行完毕");
//	}
//	public void run(){
//		Thread.currentThread().setName("Thread--->>Thread");
//		b.funB(a);
//		System.out.println("其他线程运行完毕");
//	}
//	public static void main(String[] args){
//		new test19();
//	}
//}
//19-15-2关键字synchronized同步方法
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
////		关键字synchronized同步方法
//			if (tickets>0){
//				try{
//					Thread.sleep(100);
//				}catch(Exception e){}
//				System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
//			}
//		
//	}
//}

//19-15-1:形成同步代码块：synchronized()
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
//				synchronized(this){		//形成同步代码块;
//					if (tickets>0){
//						try{
//							Thread.sleep(100);
//						}catch(Exception e){}
//						System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
//					}
//				}
//			}
//		}
//	}

//19-15
//线程的同步问题，出现问题bug
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
//					System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
//				}
//			}
//		}
//	}


//19-14
//中断main线程----》抛出异常---》清除中断标志----》重新回到线程
//	public class test19{
//		public static void main(String[] args){
//			Thread t=Thread.currentThread();
//			System.out.println("A:t.isInterrupted()="+t.isInterrupted());
//			t.interrupt();
//			System.out.println("B:t.isInterrupted()="+t.isInterrupted());
//			System.out.println("c:t.isInterrupted()="+t.isInterrupted());
//			try{
//				Thread.sleep(2000);
//				System.out.println("线程没有被中断！");
//			}catch(InterruptedException x){
//				System.out.println("线程被中断");
//			}
//			System.out.println("D:t.isInterrupted()="+t.isInterrupted());
//	
//		}
//	}

//19-13
//线程的中断：interrupt()
//	public class test19 implements Runnable{
//		public void run(){
//			try{
//				System.out.println("在run方法中 -这个线程休眠20秒");
//				Thread.sleep(10000);		//原来的数是20000
//				System.out.println("在run方法中 -继续运行");
//			}catch(InterruptedException x){
//				System.out.println("在run方法中 -中断线程");
//				return;
//			}
//			System.out.println("在run方法中 -休眠之后程序继续完成");
//			System.out.println("在run方法中 -正常退出");
//		}
//		public static void main(String[] args){
//			test19 si=new test19();
//			Thread t=new Thread(si);
//			t.start();
//			try{
//				Thread.sleep(20000);		//原来的额数是2000
//			}catch(InterruptedException x){}
//			System.out.println("在main方法中 -中断其他线程");
//			t.interrupt();
//			System.out.println("在main方法中 -退出");
//		}
//	}

//19-12
//线程的休眠：sleep();
//	public class test19 extends Thread{
//		public void run(){
//			loop();
//		}
//		public void loop(){
//			String name=Thread.currentThread().getName();
//			System.out.println(name+"---->>刚刚进入loop方法");
//			for(int i=0;i<10;i++){
//				try{
//					Thread.sleep(200);
//				}catch(InterruptedException x){}
//				System.out.println("name="+name+"    i="+i);
//			}
//			System.out.println(name+"---->>离开loop方法");
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
//线程的强制运行pp.join()
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
//后台线程与setDaemon()方法：如果一个程序中只剩下后台程序在运行，则这个进程就会结束。
//若某个线程调用了setDaemon()方法，则这个线程转入后台运行。
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

////19-9 判断线程是否启动isAlive();
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
//		System.out.println("在调用start()方法之前，t.isAlive()="+t.isAlive());
//		t.start();
//		System.out.println("刚刚调用start()方法时，t.isAlive()="+t.isAlive());
//		
//		for(int i=0;i<10;i++){
//			t.printMsg();
//		}
//		System.out.println("main结束时，t.isAlive()="+t.isAlive());
//	}
//}

//19-8 设置线程名称：setName();
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

//	19-7 线程名称的分配:getName();
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

//	19-6 用Runnable接口实现多线程使用
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
//					System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
//			}
//		}
//	}

//19-5 Thread类的继承使用实例
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
//					System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
//			}
//		}
//	}
//19-4 Thread类的继承使用
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
//					System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
//			}
//		}
//	}

//19-3通过 实现Runtable接口实现多线程???
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


//19-2同时激活多个线程???
//	public class test19{
//		public static void main(String args[]){
//			new TestThread().start();
//			for(int i=0;i<10;i++){
//				System.out.println("main线程在运行");
//			}
//		}
//	}
//	class TestThread extends Thread{
//		public void run(){
//			for(int i=0;i<10;i++){
//				System.out.println("TestThread线程正在运行");
//			}
//		}
//	}

//19-1线程使用范例
//	public class test19 {
//		public static void main(String args[]){
//			new TestThread().run();
//			for(int i=0;i<10;i++){
//				System.out.println("main线程在运行");
//			}
//		}
//	}
//	class TestThread{
//		public void run(){
//			for(int i=0;i<10;i++){
//				System.out.println("TestThread正在运行");
//			}
//		}
//	}

