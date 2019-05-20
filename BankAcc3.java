public class BankAcc3{
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


	void deposit(double amt)
	{
		if(amt>10000)
			System.out.println(name+", you cannot deposit more than Rs.10000 at a time.\n");
		else{
			amount+=amt;
			System.out.println(name+", you have successfully deposited Rs. "+amt+" to your account.");
			System.out.println("Your current balance is Rs. "+amount);
			System.out.println();
		}
	}


	void withdraw(double amt)
	{
		if(amount-amt<1000)
		{
			System.out.println("Insufficient balance!");
			System.out.println(name+", you must have a minimum balance of Rs.1000 in your account.\n");
		}
		else{
			amount-=amt;
			System.out.println(name+", you have successfully withdrawn Rs. "+amt+" from your account.");
			System.out.println("Your current balance is Rs. "+amount);
			System.out.println();
		}
	}


	public static void main(String args[])
	{
		BankAcc3 obj1=new BankAcc3();
		BankAcc3 obj2=new BankAcc3();

		obj1.setValue("Ankit");
		obj1.setValue(30000);
		obj2.setValue("Srota");
		obj2.setValue(40000);

		obj1.deposit(20000);
		obj2.deposit(500);

		obj1.withdraw(5000);
		obj2.withdraw(50000);
	}
}