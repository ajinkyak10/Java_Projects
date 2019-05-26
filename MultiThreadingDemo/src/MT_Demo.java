class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hii");
			try 
			{
				Thread.sleep(999);
			} catch (InterruptedException e) 
			{
				//e.printStackTrace();
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
public class MT_Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		A a=new A();
		a.start();//start() will internally call run()
		
		B b=new B();
		b.start();
	}
}
