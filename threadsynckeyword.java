class Test{
	synchronized void print_text(String str){
		System.out.println(str);
		try{
			Thread.sleep(100);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

class MyThread1 extends Thread{
	Test t1;
	MyThread1(Test t){
		t1 = t;
	}
	public void run(){
		for(int i=0; i<5; i++)
			t1.print_text("hello");
	}
}

class MyThread2 extends Thread{
	Test t2;
	MyThread2(Test t){
		t2 = t;
	}
	public void run(){
		for(int i=0; i<5; i++)
			t2.print_text("world");
	}
}

public class threadsynckeyword{
	public static void main(String args[]){
		Test obj = new Test();
		MyThread1 th1 = new MyThread1(obj);
		MyThread2 th2 = new MyThread2(obj);
		th1.start();
		th2.start();
	}
}
