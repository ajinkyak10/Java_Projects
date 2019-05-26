class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hii");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class MT_Demo 
{
	public static void main(String[] args) 
	{
		A a=new A();		
		B b=new B();
	
		Thread t=new Thread(a);
		Thread t1=new Thread(b);
		
		t.start();
		try {Thread.sleep(100);} catch (InterruptedException e){}
		t1.start();
	}
}
