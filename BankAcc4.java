public class BankAcc4{
	String name;
	double amount;
	public BankAcc4()
	{
		name=" ";
		amount=0;
		System.out.println("Constructor 1 is called.");
	}

	public BankAcc4(String nm)
	{
		name=nm;
		System.out.println("Constructor 2 is called.");
	}

	public BankAcc4(double amt)
	{
		amount=amt;
		System.out.println("Constructor 3 is called.");
	}

	public BankAcc4(String nm,double amt)
	{
		name=nm;
		amount=amt;
		System.out.println("Constructor 4 is called.");
	}


	void getValue()
	{
		System.out.println("Account holder's name: "+name);
		System.out.println("Balance in account: Rs."+amount+"\n");
	}



	public static void main(String[] args) {
		BankAcc4 obj1 = new BankAcc4();
		BankAcc4 obj2 = new BankAcc4("Ankit");
		BankAcc4 obj3 = new BankAcc4(40000);
		BankAcc4 obj4 = new BankAcc4("Sam",10000);


		obj1.getValue();
		obj2.getValue();
		obj3.getValue();
		obj4.getValue();
	}
}