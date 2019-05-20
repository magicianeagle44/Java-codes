class mt extends Thread{
	static String s[]={"I", "LOVE", "JAVA"};
	public void run()
	{
		s1.m1(s);
	}

	void waiting()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
	}
}

class s1{
	public static synchronized void m1(String ob[])
	{
		mt t=(mt)Thread.currentThread();
		for(int i=0;i<ob.length;i++)
		{
			t.waiting();
			System.out.println(ob[i]);
		}
	}
}

public class ThreadSync{
	public static void main(String args[]){
		mt ob=new mt();
		mt ob1=new mt();
		ob.start();
		ob1.start();
	}
}	
