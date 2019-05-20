abstract class Employee
{
	String Name,ID,Dept,Dsgn;
	int Bas,DA,HRA;
	float SAL;
	abstract void salcalculate();
	void getDetails()
	{
		System.out.println("\n :: Employee Details::");
		System.out.println("\n Name:" +Name);
		System.out.println("\n Employee ID: "+ID);
		System.out.println("\n Department: "+Dept);
		System.out.println("\n Designation :"+Dsgn);
		System.out.println("\n Basic: "+Bas);
		System.out.println("\n D.A:" +DA);
		System.out.println("\n H.R.A.:" +HRA);
		System.out.println("\n Total Salary :"+ SAL+"\n\n");
	}
}

class Manager extends Employee
{
	int MED;
	public Manager(String N,String I,String D, String Dsg, int B)
	{
		Name=N;
		ID=I;
		Dept=D;
		Dsgn=Dsg;
		Bas=B;
	}

	void salcalculate()
	{
	DA=(Bas*30)/100;
	HRA=(Bas*15)/100;
	MED=300;
	SAL=Bas+DA+HRA+MED;
	super.getDetails();
	}
}

class Clerk extends Employee
{
	 public Clerk(String N,String I,String D, String Dsg, int B)
	{
		Name=N;
		ID=I;
		Dept=D;
		Dsgn=Dsg;
		Bas=B;
	}

	void salcalculate()
	{
		DA=(Bas*20)/100;
		HRA=(Bas*10)/100;
		SAL=Bas+DA+HRA;
		super.getDetails();
	}
}

public class EmpType
{
	public static void main(String args[])
	{
		Manager E1=new Manager("Xyz Abc","ADM/XA/013","Admin","HR",5000);
		E1.salcalculate();

		Clerk E2=new Clerk("Abc Xyz","CLRK/AX/033","Account","Head Clerk",5000);
		E2.salcalculate();
	}
}
