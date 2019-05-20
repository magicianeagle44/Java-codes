class ExceptTest1{
	public static void main(String args[])
	{
		int a=0,b=0,x;
		System.out.println("The arguments are------");
		for(int i=0;i<args.length;i++)
		{
			System.out.println("Argument "+(i+1)+": "+args[i]);
		}

		try{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
		}

		catch(Exception e)
		{
			System.out.println("\nFirst Exception: Enter two arguments(Numeric value)\n");
			System.out.println("Error description: "+e);
		}

		try{
			x=b/a;
			System.out.println("\nDivision Result: "+x);
		}

		catch(Exception k)
		{
			System.out.println("\nSecond Exception: Enter a non-zero value for divider\n");
			System.out.println("\nError description: "+k);
		}
	}
}