class counter extends Thread
{
	int count;
		public synchronized void increment()
		{
		count++;
		}
}
public class ThreadDemo {
	public static void main(String[]args) throws Exception
	{
		counter c=new counter();
	Runnable obj1=new Runnable()
	{
		public void run()
		{
			for(int i=1;i<=1000;i++)
			{
				c.increment();
			}
		}
	};
	Runnable obj2=new Runnable()
	{
		public void run()
		{
			for(int i=1;i<=1000;i++)
			{
				c.increment();
			}
		}
	};
Thread t1=new Thread(t1);
Thread t1=new Thread(t2);
	t1.start();
	t2.start();
	t1.join();
	t2.join();
		System.out.println("Count "+c.count);
	}
}
