class Base{
	int base_data;
	public Base()
	{
		base_data=10;
	}

	public Base(int a)
	{
		base_data=a;
	}

	void setValue(int a)
	{
		base_data+=a;
		System.out.println("base_data is incremented to "+base_data);
	}

	void getValue()
	{
		System.out.println("base_data= "+base_data);
	}
}


class Derived extends Base{
	int derived_data;
	public Derived()
	{
		super();
		derived_data=20;
	}

	public Derived(int a,int b)
	{
		super(a);
		derived_data=b;
	}

	void getData()
	{
		super.getValue();
		System.out.println("derived_data= "+derived_data);
		System.out.println();
	}

	void setData(int a,int b)
	{
		super.setValue(a);
		derived_data+=b;
		System.out.println("derived_data is incremented to "+derived_data+"\n\n");
	}
}


class Inhr1{
	public static void main(String[] args){
		Derived obj1 = new Derived();
		Derived obj2 = new Derived(35,57);

		obj1.getData();
		obj1.setData(21,30);

		obj2.getData();
		obj2.setData(19,77);
	}
}