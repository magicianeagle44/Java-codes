public class ExceptTest3{
	int no1,no2;
	public ExceptTest3(int n1,int n2)
	{
		no1=n1;
		no2=n2;
	}

	public void testFunction() throws Exception
	{
		int res;
		if(no2==0)
			throw new Exception();
		else{
			res=no1/no2;
			System.out.println("Result of "+no1+"/"+no2+" = "+res);
		}
	}


	public static void main(String[] args) {
		ExceptTest3 obj = new ExceptTest3(50,0);
		try{
			obj.testFunction();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}	
	}
}