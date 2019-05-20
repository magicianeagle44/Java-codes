import java.io.*;

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


public class Input3{
	int no1,no2;
	public Input3(int n1,int n2)
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

	public static void main(String[] args) throws IOException{
		int a,b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter the 1st number: ");
		a=Integer.parseInt(br.readLine());

		System.out.print("\nEnter the 2nd number: ");
		b=Integer.parseInt(br.readLine());

		Input3 obj = new Input3(a,b);
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