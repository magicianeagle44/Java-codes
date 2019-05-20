class MyException extends Exception{
	public String toString()
	{
		return("\tException 1:: Override System defined Exception\n");
	}
	public String getMessage()
	{
		return("\n\tException 2:: User defined Exception");
	}
}


public class ExceptTest4{
	int no1,no2;
	public ExceptTest4(int n1,int n2)
	{
		no1=n1;
		no2=n2;
	}

	public void testFunction() throws MyException
	{
		int res;
		if(no2==0)
			throw new MyException();
		else{
			res=no1/no2;
			System.out.println("Result of "+no1+"/"+no2+" = "+res);
		}

	}

	public static void main(String[] args) {
		ExceptTest4 obj = new ExceptTest4(50,0);
		try{
			obj.testFunction();
		}
		catch(MyException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}	
	}
}