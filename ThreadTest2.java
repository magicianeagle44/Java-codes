class MyThread extends Thread{
	public void run()
	{
		System.out.println("\n\tChild Thread Started\n");
		try
		{
			for(int c=0;c<3;c++){
				System.out.println("\n\t"+Thread.currentThread().getName()+" - "+c);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{}
	}
}

class ThreadTest2{
	public static void main(String args[]){
		System.out.println("\n\tMain Thread Started\n");
		MyThread t1=new MyThread();
		t1.start();
		
		try
		{
			for(int c=100;c<105;c++){
				System.out.println("\n\t"+Thread.currentThread().getName()+" - "+c);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{}
	}
}