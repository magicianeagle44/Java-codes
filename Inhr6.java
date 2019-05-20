class Persons{
	String name, address;
	int age;

	public Persons(String nm,String adr,int x)
	{
		name=nm;
		address=adr;
		age=x;
	}

	public void getInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Addess: "+address);
		System.out.println("Age: "+age);
	}

}

class Employee extends Persons{
	String id,designation,type;
	double salary;

	public Employee(String nm,String adr,int x,String i,String dsg,String s,double sal)
	{
		super(nm,adr,x);
		id=i;
		designation=dsg;
		type=s;
		salary=sal;
	}

	public void getInfo()
	{
		super.getInfo();
		System.out.println("ID: "+id);
		System.out.println("Designation: "+designation);
		System.out.println("Type: "+type);
		System.out.println("Salary: "+salary);

	}
}

class Manager extends Employee{
	String managerCode,region;

	public Manager(String nm,String adr,int x,String i,String dsg,String s,double sal,String mc,String rg)
	{
		super(nm,adr,x,i,dsg,s,sal);
		managerCode=mc;
		region=rg;
	}

	public void getInfo()
	{
		super.getInfo();
		System.out.println("Manager Code: "+managerCode);
		System.out.println("Region: "+region);
	}
}




class Inhr6{
	public static void main(String[] args) {
		Manager m = new Manager("Mark","Kolkata",28,"BCD/11B","Regional Manager","HR",150000,"RM031","Eastern");
		m.getInfo();
	}
}