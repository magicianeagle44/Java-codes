public class BankAcc5{
	String name;
	double amount;
	public BankAcc5()
	{
		name=" ";
		amount=0;
		System.out.println("Constructor 1 is called.");
	}

	public BankAcc5(String nm)
	{
		name=nm;
		System.out.println("Constructor 2 is called.");
	}

	public BankAcc5(double amt)
	{
		amount=amt;
		System.out.println("Constructor 3 is called.");
	}

	public BankAcc5(String nm,double amt)
	{
		name=nm;
		amount=amt;
		System.out.println("Constructor 4 is called.");
	}


	void setValue(String nm)
	{
		name=nm;
	}

	void setValue(double amt)
	{
		amount=amt;
	}


	void setValue(String nm,double amt)
	{
		name=nm;
		amount=amt;
	}

	void getValue()
	{
		System.out.println("Account holder's name: "+name);
		System.out.println("Balance in account: Rs."+amount+"\n");
	}



	public static void main(String[] args) {
		BankAcc5 obj1 = new BankAcc5();
		BankAcc5 obj2 = new BankAcc5("Ankit");
		BankAcc5 obj3 = new BankAcc5(40000);
		BankAcc5 obj4 = new BankAcc5("Sam",10000);


		obj1.setValue("Ravi",3000);
		obj2.setValue(4500);
		obj3.setValue("Rita");
		obj4.setValue("Shyam",47000);



		obj1.getValue();
		obj2.getValue();
		obj3.getValue();
		obj4.getValue();
	}
}