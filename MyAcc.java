import java.io.*;

class BankAcc{
	String name;
	int accID;
	double amtBalance;
	public BankAcc(String n,int acc,double amt)
	{
		name=n;
		accID=acc;
		amtBalance=amt;
	}

	public void display()
	{
		System.out.println("\n\tAccount name: "+name);
		System.out.println("\n\tAccount number: "+accID);
		System.out.println("\n\tAccount Balance: "+amtBalance);
	}
}

public class MyAcc{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfAcc=0;

		String nm;
		int ac;
		double amnt;

		BankAcc Cust[];

		System.out.print("Enter how many accounts do you want to create: ");
		noOfAcc=Integer.parseInt(br.readLine());

		Cust=new BankAcc[noOfAcc];

		for(int i=0;i<noOfAcc;i++)
		{
			System.out.print("\n\tCreate account of person number: "+(i+1));
			System.out.print("\n\nEnter the name of the person: ");
			nm=br.readLine();

			System.out.print("\n\nEnter the account number of the person: ");
			ac=Integer.parseInt(br.readLine());

			System.out.print("\n\nEnter the opening amount(initial deposit): ");
			amnt=Double.parseDouble(br.readLine());

			Cust[i]=new BankAcc(nm,ac,amnt);
		}

		System.out.print("\n\t-------Details of Accounts-------");
		for(int i=0;i<noOfAcc;i++)
		{
			System.out.print("\n\nAccount details of person "+(i+1));
			Cust[i].display();
		}
	}
}



