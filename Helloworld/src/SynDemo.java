public class SynDemo 
{
	public static void main(String[]args) throws Exception
	{
	Thread t1=new Thread(()->{for(int i=1;i<=5;i++)
	{
		System.out.println("Hi");
		try {Thread.sleep(1000);}catch(Exception e) {}
	}
});
	Thread t2=new Thread(()->{for(int i=1;i<=5;i++)
	{
		System.out.println("Hello");
		try {Thread.sleep(1000);}catch(Exception e) {}
	}
});// obj2 of Thread
	t1.start();
	try {Thread.sleep(10);}catch(Exception e) {}
	t2.start();
	t1.join();
	t2.join();
	System.out.println("bye");
	}
}
