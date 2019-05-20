class Person{
	String name;
	int age;
	public Person()
	{
		name="";
		age=0;
	}

	
	public void getValue()
	{
		System.out.println("Name: "+name+"\nAge: "+age);
	} 

	public void setValue(String nm,int x)
	{
		name=nm;
		age=x;
	}
}



class Student extends Person{
	int roll;
	String class_name;
	public Student()
	{
		super();
		roll=0;
		class_name="";
	}

	public void setValue(String name,int age,String xx,int rl)
	{
		super.setValue(name,age);
		class_name=xx;
		roll=rl;
	}

	public void setValue(String nm,int x)
	{
		class_name=nm;
		roll=x;
	}

	public void setValue(int x)
	{
		age+=x;
	}

	public void getValue()
	{
		super.getValue();
		System.out.println("Class: "+class_name+"\nRoll no: "+roll+"\n\n");
	}
}

class Inhr2{
	public static void main(String[] args) {
		Student obj = new Student();

		obj.getValue();

		obj.setValue("Ankit",20,"XV",06);
		obj.getValue();

		obj.setValue("XII",16);
		obj.getValue();

		obj.setValue(2);
		obj.getValue();

	}
}