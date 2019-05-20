class Thread1
{	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		System.out.println("\n\tThread name "+t.getName()+"\n");
		System.out.println("\n\tThread priority "+t.getPriority()+"\n");
		try
		{
			t.setName("thread-soumen");
			t.setPriority(Thread.MAX_PRIORITY);
			System.out.println("\n\tThread name "+t.getName()+"\n");
			System.out.println("\n\tThread priority "+t.getPriority()+"\n");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
	}
}
