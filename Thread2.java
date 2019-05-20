class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("\n I AM RUNNING.");
	}

	public void start()
	{
		System.out.println("\n I START");
	}

	public void stop()
	{
		System.out.println("\n I STOP.");
	}

	public void sleep()
	{
		System.out.println("\n I AM SLEEPING.");
	}
}

public class Thread2{
	public static void main(String args[]){
		MyThread obj=new MyThread();
		Thread t=new Thread(obj);
		System.out.println("\n"+t);
		//t.run();
		t.start();
		//t.stop();
		//t.sleep();

		try
		{
			t.sleep(1000);
		}
		catch(Exception e)
		{}
	}
}