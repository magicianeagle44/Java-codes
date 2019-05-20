public class BankAcc1{
	String name;
	double amount;

	void getValue()
	{
		System.out.println("Account holder's name: "+name);
		System.out.println("Balance in account: Rs. "+amount+"\n\n");
	}


	void setValue(String nm,double amt)
	{
		name=nm;
		amount=amt;
	}

	public static void main(String args[])
	{
		BankAcc1 obj1=new BankAcc1();
		BankAcc1 obj2=new BankAcc1();

		obj1.setValue("Ankit",30000);
		obj2.setValue("Srota",50000);

		obj1.getValue();
		obj2.getValue();
	}
}