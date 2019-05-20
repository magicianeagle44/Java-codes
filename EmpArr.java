class EmpArr implements MyList{
	Emp e[];
	int size;

	EmpArr(int s1)
	{
		String s= "Peter Alexx Steve Garry Kavin Mikey Merry Brown Brett";

		int n=0;
		e=  new Emp[size =s1];
		for(int x=0; x<size;x++){
			e[x]= new Emp(s.substring(n,n+5));
			n=n+6;
		}
	}


	public void sort()
	{
		for(int x=0;x<size;x++){
			for(int y=x+1;y<size;y++){
				if((e[y].to_String()).compareTo((e[x].to_String()))<1)
				{
					Emp temp =e[x];
					e[x]=e[y];
					e[y]=temp;
				}
			}
		}
		System.out.println("Employee Array sorted");
	}

	public void show()
	{
		for(int x=0;x<size;x++){
			System.out.println(e[x].to_String());
		}
	}
}


class Emp{
	String ename;
	Emp(String s)
	{
		ename=s;
	}

	String to_String()
	{
		return ename;
	}
}
