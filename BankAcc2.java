public class BankAcc2{
	String name;
	double amount;

	void getValue()
	{
		System.out.println("Account holder's name: "+name);
		System.out.println("Balance in account: Rs. "+amount+"\n\n");
	}


	void setValue(String nm)
	{
		name=nm;
	}

	void setValue(double amt)
	{
		amount=amt;
	}


	public static void main(String args[])
	{
		BankAcc2 obj1=new BankAcc2();
		BankAcc2 obj2=new BankAcc2();

		obj1.setValue("Ankit");
		obj1.setValue(30000);
		obj2.setValue("Srota");
		obj2.setValue(50000);

		obj1.getValue();
		obj2.getValue();
	}
}