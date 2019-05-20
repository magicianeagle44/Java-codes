class ThreadTest1
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();

		System.out.println("\n\t CURRENT THREAD="+t);

		t.setName("TestThread");

		System.out.println("\n AFTER NAME CHANGE CURRENT THREAD ="+t);
		
		try
		{
			for(int c=0;c<5;c++)
			{
				System.out.println(Thread.currentThread().getName()+"- "+c);

				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{}
	}
}
