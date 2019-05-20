import java.io.*;
import java.util.Scanner;
class BankAcc{
	String name;
	int accID;
	double amtBalance;
	public BankAcc(String n, int acc, double amt){
		name = n;
		 accID = acc;
		 amtBalance = amt;
	}
	public int searchAcc(int acID){
		if(accID == acID){
			System.out.println("\n\tAccount Name: "+name);
			System.out.println("\n\tAccount Number: "+accID);
			System.out.println("\n\tAccount Balance: "+amtBalance);
			return (1);
		}return (0);
	}
	public void deposit(double amt){
		amtBalance+=amt;
		System.out.println("\n\t"+name+" Deposited Rs. "+amt+"/-");
	}
	public void withdraw(double a){
		if(a > amtBalance){
			System.out.println("\n\n\tSORRY!! Withdrawal amount exceeds the balance amount!\n");
			System.out.println("\n\tWithdrawal amount = "+a);
			System.out.println("\n\tAccount Balance = "+amtBalance);
		}
		else if ((amtBalance-a)< 1000) {
			System.out.println("\n\n\tSORRY!! Insufficient account balance!");
			System.out.println("\n\tWithdrawal amount = "+a);
			System.out.println("\n\tAccount Balance = "+amtBalance);			
		}
		else{
			amtBalance-=a;
			System.out.println("\n\t"+name+" Withdraws Rs. "+a+"/-");
		}
	}
	public void display(){
		System.out.println("\n---------------------------------------------------");
		System.out.println("\n\tAccount Name: "+name);
		System.out.println("\n\tAccount Number: "+accID);
		System.out.println("\n\tAccount Balance: "+amtBalance);
		System.out.println("\n---------------------------------------------------");
	}
}

public class BankTrans{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int noOfAcc = 0;
		String nm;
		int ac;
		double amt;
		BankAcc cust[];


		try{
			System.out.print("\nEnter how many accounts do you want to create? ");
			noOfAcc = scan.nextInt();

			cust = new BankAcc[noOfAcc];

			for(int i = 0; i<noOfAcc; i++){
				System.out.print("\n\n\tCREATE ACCOUNT OF PERSON NO - "+(i+1));
				System.out.print("\n\n Enter the name of the person: ");
				nm = sc.nextLine();
				System.out.print("\n Enter the Account number: ");
				ac = scan.nextInt();
				if(ac<1000){
					System.out.println("\tSORRY! Please Enter at least 4 digit Account number!\n");
					System.out.print("\n Re-enter the Account number of the person: ");
					ac = scan.nextInt();
				}
				System.out.print("\n Enter the opening amount(Initial Deposit): ");
				amt = scan.nextDouble();
				if(amt < 1000){
					System.out.println("\tSORRY! Opening amount must be more than Rs. 1,000.00/-\n");
					System.out.print("Re-enter the opening amount(Initial Deposit): ");
					amt = scan.nextDouble();
				}
				cust[i] = new BankAcc(nm, ac, amt);
			}

			System.out.println("\t\t--------------# DETAILS OF ACCOUNT #---------------");
			System.out.println("\n--------------------------------------------------------");
			for (int i = 0; i<noOfAcc; i++) {
				System.out.println("\n\tACCOUNT DETAILS OF THE PERSON "+(i+1));
				cust[i].display();
			}
			while(true){
				System.out.println("\n\t\t----------# DETAILS OF TRANSACTION #------------");
				System.out.println("\nTransaction options are:: ");
				System.out.println("\n\t1) Deposit Amount.\n\n\t2) Withdraw Amount.\n\n\t3) Show account details.\n\n\t4) EXIT Transaction portal.\n");
				System.out.print("\n Choose your transaction type: ");
				int ch = scan.nextInt();
				if(ch > 4 || ch < 1)
					System.out.println("\n\n\tWRONG CHOICE!!\n");
				else if (ch == 4) {
					System.out.println("\nExitted from the program.......\n");
					System.exit(0);
				}
				else{
					System.out.print("\n Enter the person's account number: ");
					int ID = scan.nextInt();
					int flag =0, chk, index = 0;
					for(int i =0; i<noOfAcc; i++){
						chk = cust[i].searchAcc(ID);
						if(chk ==1){
							flag = 1;
							index = i;
						}
					}
				if(flag == 0){
				System.out.println("\n\n\tThe person having account number "+ID+"was not found!!\n");
				System.out.println("\n\tPlease verify the account number!\n");
					}
					else{
					switch(ch){
					case 1: System.out.println("\nEnter the deposit amount: ");
							double DA = scan.nextDouble();
							if(DA <=0){
					    		System.out.println("\n\tSORRY! Enter positive amount for Deposit!!\n");
								System.out.print("Re-enter the deposit amount: ");
								DA = scan.nextDouble();
							}
							cust[index].deposit(DA);
							cust[index].display();
							break;
					case 2: System.out.println("\nEnter the Withdrawal amount: ");
							double WA = scan.nextDouble();
							if(WA <=0){
							System.out.println("\n\tSORRY! Enter positive amount for Withdrawal!!\n");
							System.out.print("Re-enter the withdrawal amount: ");
							WA = scan.nextDouble();
							}
							cust[index].withdraw(WA);
							cust[index].display();
							break;
					case 3: System.out.println("\t\t-----------# DETAILS OF ACCOUNTS #------------");
							cust[index].display();
							break;
						}
					}
				}
			}
		}
		catch(Exception e){
			System.out.println("\n\t\tSORRY!! Exception occurred!\n\t"+e);
		}
	}
}

